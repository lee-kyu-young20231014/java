import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DBConnection;

public class JDBCTest_select {

	public static void main(String[] args) {
		// 1. 드라이버 로드
		// 2. 접속정보를 가지고  connection 객체 생성
		// 3. sql문장을 실행할 statement  객체 생성
		// 4. statement 객체를 통해 sql문장을 실행
		// 5. 조회 결과는 ResultSet 객체로 받아서
		// 6. ResultSet객체를 순환하면서(각각의 row,record 데이터) 데이터를 가져온다
		
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			conn = (new DBConnection()).getConn();			
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from student");
			while(rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				String dept = rs.getString("dept");
				int subjects = rs.getInt("score");
				System.out.format("id:%s name:%s dept:%s subjects:%d\n", id,name,dept,subjects);			}
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
