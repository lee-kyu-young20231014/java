public class Java01 {

	public static void main(String[] args) {
//		연산자  두개의 정수형 변수를 만든다
//		두개변수를 이용해서 기본 연산을 수행 하고 그 결과를 출력
		int num1 = 10, num2 = 20;  // 같은 타입의 여러개의 변수를 정의하고 초기화
		System.out.println(num1+num2); // 두개의 변수를 직접더해서 그 결과를 출력
//		두개의 변수를 더해서 그 결과를 새로운 변수에 할당하고 그 변수의 값을 출력
		int result = num1 + num2;
		System.out.println(result);
//		- * / % 
		result = num1 - num2;
		System.out.println(result);
		
		result = num1 * num2;
		System.out.println(result);
		
		result = num1 / num2;
		System.out.println(result);
		
		result = num1 % num2;
		System.out.println(result);
		
		
	}

}
