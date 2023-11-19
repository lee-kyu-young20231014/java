
public class Resercher extends Student{

	public void rearch() {
		System.out.println("연구합니다.");
	}
	// override
	// 재 정의
	public void study() {
		System.out.println("연구분야를 공부합니다.");
	}
	public void printInfo() {
		study();
		super.study();
	}
}
