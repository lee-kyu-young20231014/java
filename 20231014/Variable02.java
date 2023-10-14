package java_20231014;

// ctrl+shift+f : 코드 정렬
public class Variable02 {
	public static void main(String[] args) {
//		1. 정수형 변수를 만들어서 값을 100으로 생성한다  age
//		2. 정수형 변수를 만드는데 초기화에 사용되는 값은 1번에서 만든 변수의 값을 이용한다  copy_age
		int age = 100; // 상수를 이용한 초기화
		int copy_age = age; // 기존 변수를 이용한 초기화
		// 각각의 변수를 출력하기
		System.out.println(age);
		System.out.println(copy_age);
		// -----------------------
		// Q1 age의 값을 변경하면 copy_age도 같이 변경될까요?
		age = 200;
		System.out.println(copy_age);		
		
//		자바파일명(클래스명)은 첫글자가 대문자로 하기로 약속함(문법아님)
//		상수를 만들때는 이 변수가 일반변수가 아니라 상수라고 알려주기위해 전부 대문자로 한다
		final int NUMBER = 10;  // 상수형 변수, 상수형변수는 만들면서 초기화하고 그 이후에 변경 불가능
//		number = 100;  number변수는 상수가 되었기때문에 변경할수 없다
		int num = NUMBER; // 읽는건 가능
		System.out.println(NUMBER);
	}
}








