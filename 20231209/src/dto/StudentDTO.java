package dto;
// DB <-> CRUD

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import dao.StudentDAO;
import db.DBConnection;

public class StudentDTO {	
	private Connection conn;
	private Statement stmt;
	public StudentDTO() {
		this.conn = (new DBConnection()).getConn();
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}			
	}
	// insert
	public int insert(StudentDAO studentDao) {
		int n = -1;
		try {
			String sql = " insert into student values('" 
			+ studentDao.getId() 
			+ "','" + studentDao.getName() 
			+ "','" + studentDao.getDept() 
			+ "'," + studentDao.getScore()
			+ ") ";
			n = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n;
	}
	// update
	public int update(StudentDAO studentDao) {
		int n = -1;
		String sql = "update student set name='"
				+ studentDao.getName()
				+ "', depth='"
				+ studentDao.getDept()
				+ "', score = "
				+ studentDao.getScore()
				+ " where id = '"
				+ studentDao.getId()
				+ "' ";
		try {
			n = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n;
	}

}
