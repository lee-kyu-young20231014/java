package dto;
// DB <-> CRUD

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
				+ "', dept='"
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

	//select id
	public StudentDAO getStudentById(String id) {
		String sql = "select * from student where id = '"
				+ id
				+ "'";
		StudentDAO studentDao = null;
		try {
			ResultSet rs =  stmt.executeQuery(sql);			
			if(rs.next()) {
				studentDao = makeStudentDao(rs);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return studentDao;
	}
	// select name
	public List<StudentDAO> getStudentByName(String name){
		String sql = "select * from student where name like '%"
				+ name
				+ "%'";
		List<StudentDAO> result = new ArrayList<StudentDAO>();
		try {
			ResultSet rs =  stmt.executeQuery(sql);
			while (rs.next()) {
				StudentDAO dao = makeStudentDao(rs);
				result.add(dao);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return result;
	}
	// select all
	public List<StudentDAO> getSelectAll(){
		return getStudentByName("");
	}
	// delete deleteStudentById
	public int deleteStudentById(String id) {
		int n = -1;
		String sql = "delete from student where id = '"
				+ id
				+ "'";
		try {
			n = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n;
	}
	
	// studentDAO 객체를 만들어주는 메소드
	private StudentDAO makeStudentDao(ResultSet rs) {
		StudentDAO dao = new StudentDAO();
		try {
			dao.setId(rs.getString("id"));
			dao.setDept(rs.getString("dept"));
			dao.setName(rs.getString("name"));
			dao.setScore(rs.getInt("score"));
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		return dao;
	}
}



