
public class Method01 {
	
	
	
	public static void main(String[] args) {
		// 프로그램의 시작점
		System.out.println("첫번째 호출 메서드");
		method();
		System.out.println("두번째 호출 메서드");
		method();
		
	}
	
	public static void method()  // 메소드 선언(어떻게 불려지냐를 정의) - 순수히 이름만 호출	
	{
		// 메소드가 실행되는 내용
		System.out.println("static 메서드 입니다.");
		System.out.println(5+6);		
	}

}
