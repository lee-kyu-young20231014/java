import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCTest {

	public static void main(String[] args) {
		Connection conn; // DB를 연결할 객체
		// 접속정보 설정
		String url = "jdbc:mysql://localhost:3306/haksa?serverTimezone=UTC";
		String id = "user";
		String psw = "1234";
		
		try {
			// mysql 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			// mysql 연결
			conn = DriverManager.getConnection(url, id, psw);
			System.out.println("DB연결 성공");
			
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 오류");
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
