
public class Review2 {

	static int staticVal = 0;
	
	public static void main(String[] args) {
		// 클래스변수는 객체와 상관없이 클래스단위로 움직이므로
		// 모든 객체가 같은 값을 공유한다.
		// 그래서 객체로 호출할수 있지만.. 클래스명으로 호출한다.
		System.out.println( Review2.staticVal  );
		// static이 붙은 변수와 메소드는 객체보다 먼저 생성되기때문에
		// static 메소드안에서는 static메소드와 static변수만 사용가능 --> 중요
	}

}
