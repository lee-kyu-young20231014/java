
public class Student {

	int id;
	String name;
	Student() {
		System.out.println("기본 생성자 Student() 호출");
	}
	// 일반생성자
	Student(int param1, String param2){
		System.out.println("일반 생성자 Student(...) 호출");
		id = param1;
		name = param2;
	}
	void insertRecord(int param1, String param2) {
		id = param1;
		name = param2;
	}
	void printInfo() {
		System.out.println("아이디 : " + id);
		System.out.println("이름 : " + name);
	}
}
