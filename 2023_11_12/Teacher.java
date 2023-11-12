/*
 * Student / Teacher 클래스의 커플링 - 인터페이스를 배우면.. de-coupling할수 있어야 한다.
 * 1 : N 
 */
public class Teacher {
	int id;
	String name;
	// 지도하는 학생배열을 만들어본다 5명을 지도한다.
	Student[] students = new Student[5];  
	int studentCount = 0;
	
	void insertStudents(Student s) {
		if(studentCount>4) {
			System.out.println("더이상 추가할수 없습니다.");
			return;
		}
		students[studentCount++] = s;
	}
	
	void printInfo() {
		System.out.println("선생님의 id : " + id);
		System.out.println("선생님의 이름은 : " + name);
		// studentCount 실제 인덱스 번호라서 i < studentCount  
		for (int i = 0; i < studentCount; i++) {
			students[i].printInfo();
		}
	}
	
	
}
