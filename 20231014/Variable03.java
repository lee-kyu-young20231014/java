package java_20231014;

/*
 * 1. 정수형 변수를 선언 및 초기화
 * 	  1-1 생성과 동시에 초기화
 * 	  1-2 생성한후에 초기화
 * 2. 만들어진 변수값으로 새로운 변수를 생성
 * 3. 생성된 변수들을 출력
 * 4. 생성된 변수를 자유롭게 값을 변경
 * 5. 정수형 상수를 만들어서 출력  final
 * 6. 정수형 상수를 이용해서 새로운 일반변수
 * 7. 정수형 상수를 이용해서 새로운 상수형 변수
 */

public class Variable03 {
	public static void main(String[] args) {
		//1
		int num1 = 10;
		int num2;
		num2 = 20;
		
		//2
		int num3 = num1;
		//3 
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		//4
		num1 = 100;
		num2 = 200;
		num3 = 300;
		
		//5
		final int MAX_COUNT = 100;
		System.out.println(MAX_COUNT);
		
		//6
		int num4 = MAX_COUNT;
		
		//7 
		final int SPEED_LIMIT = MAX_COUNT;
		
		
		
	}
}
