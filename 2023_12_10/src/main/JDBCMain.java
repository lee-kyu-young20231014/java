package main;

import java.util.List;
import java.util.Scanner;

import dao.StudentDAO;
import dto.StudentDTO;

public class JDBCMain {
	private static StudentDTO dto = new StudentDTO();
	private static void printAll() {
		List<StudentDAO> result = dto.getSelectAll();
		for (StudentDAO studentDAO : result) {
			System.out.format("학번:%s 이름:%s 전공:%s 점수:%d\n",
					studentDAO.getId(),studentDAO.getName(),studentDAO.getDept()
					,studentDAO.getScore()
					);
		}
	}
	private static StudentDAO getData() {
		Scanner sc = new Scanner(System.in);		
		String[] inputs = sc.nextLine().split(" ");
		String id = inputs[0];
		String name = inputs[1];
		String dept = inputs[2];
		int score = Integer.valueOf(inputs[3]);
		StudentDAO dao = new StudentDAO();
		dao.setId(id); dao.setName(name); dao.setDept(dept); dao.setScore(score);
		return dao;
	}
	public static void main(String[] args) {
		// 학생정보 받아서 학생테이블에 insert 하기
		// 학번,이름,전공,점수 입력받는다
		System.out.println("공백을 기준으로 학번 이름 전공 점수 입력하세요");
		StudentDAO dao = getData();
		// DB에 입력
		dto.insert(dao);
		
		// 전체 조회
		printAll();
		
		// 아이디 받아서 삭제
		System.out.print("삭제할 아이디를 입력해 주세요 : ");
		Scanner sc = new Scanner(System.in);
		String id = sc.next();
		dto.deleteStudentById(id);
		// 전체 조회
		printAll();
		
		// 아이디 받아서 이름과 과목과 점수를 수정
		System.out.println("공백을 기준으로 수정할 학번과 이름 전공 점수를 입력하세요");		
		dao = getData();		
		dto.update(dao);
		// 전체 조회
		printAll();		
	}

}
