
public class Professor extends Resercher{

	public void teach() {
		System.out.println("가르칩니다");
	}
	// 누구 study를 재정의? Resercher	
	public void study() {
		System.out.println("교수법을 공부합니다.");
	}
	public void printInfo() {
		study(); // 자신의 study()
		super.study(); // 바로 위 부모의 study()
		// 그럼 Student의 study를 호출하는 방법은?
		// Study클래스의 객체를 만들어서 호출
	}
}
