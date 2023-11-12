
public class Student {
	int id;
	String name;
	
	void insertRecord(int param1, String param2) {
		id = param1;
		name = param2;
	}
	void printInfo() {
		System.out.println("아이디 : " + id);
		System.out.println("이름 : " + name);
	}
}
