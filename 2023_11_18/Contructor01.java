
public class Contructor01 {

	public static void main(String[] args) {
		// Student 객체 한개 만들기
		Student s1 = new Student();  // 생성자 호출
		// id : 20231115   이름 : 홍길동   직접변수에 셋팅하지 않고
		s1.insertRecord(20231115, "홍길동");
		s1.printInfo();
		
		// 일반생성자를 통해 원하는 값을 가지는 객체를 만들고 출력 ( insertRecord 사용 안함)
		Student s2 = new Student(202311212, "홍길동");
		s2.printInfo();
	}

}
