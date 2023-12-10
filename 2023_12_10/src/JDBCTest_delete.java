import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DBConnection;

public class JDBCTest_delete {
	// insert 기능
	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			// 데이터 베이스 접속 ------
			conn = (new DBConnection()).getConn();
			// 데이터 베이스 접속 ------
			
			// 데이터 조작을 위한 statement객체 생성
			stmt = conn.createStatement();	
			
			// insert , update ,delete --> executeUpdate
			String id = "20231201";
			String sql = "delete from student where id = '"
					+ id
					+ "'";			
			int n = stmt.executeUpdate(sql);
			System.out.println(n+"개 의 데이터가 delete 되었습니다.");			
		} catch (SQLException e) {			
			e.printStackTrace();
		}finally {			
				try {
					if(rs != null) rs.close();
					if(stmt != null) stmt.close();
					if(conn != null) conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	}

}
