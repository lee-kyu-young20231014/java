package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// connect 을 해서  connection객체를 반환
public class DBConnection {
	private Connection conn;
	public DBConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/haksa?serverTimezone=UTC", 
					"user", "1234"
					);		
		} catch (ClassNotFoundException e) {			
			System.out.println("드라이버 로드 실패");
		} catch (SQLException e) {
			System.out.println("접속 실패");
		}
	}
	public Connection getConn() {
		return conn;
	}	
	
}
