
public class Demo3 {

	public static void main(String[] args) {
		// 학생 5명 
		// 선생 1명
		// 선생과 학생 연결
		// 선생의 정보를 출력
		Student s1 = new Student(); s1.id = 1; s1.name = "홍길동1";
		
		Student s2 = new Student(); s2.id = 2; 	s2.name = "홍길동2";
		
		Student s3 = new Student();	s3.id = 3; 	s3.name = "홍길동3";
		
		Student s4 = new Student(); s4.id = 4;	s4.name = "홍길동4";
		
		Student s5 = new Student();	s5.id = 5; 	s5.name = "홍길동5";
		
		Teacher t = new Teacher();
		t.id = 1; 	t.name = "호랑이 선생님";
		// Student배열에 데이터 삽입
		t.insertStudents(s1);t.insertStudents(s2);t.insertStudents(s3);
		t.insertStudents(s4);t.insertStudents(s5);t.insertStudents(s5);
		
		t.printInfo();
		
	}

}
