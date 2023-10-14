package java_20231014;

public class Variable05 {

	public static void main(String[] args) {
//		정수형 변수 두개를 한라인(인라인)으로 표현하고 초기화
		int num1=10, num2=20;
//		두개의 변수를 더해서 새로운 변수에 할당하고 출력
		int sum = num1 + num2;
		System.out.println(sum);
//		위의 코드를 응용해서 4칙연산 해 보기(- * /)
		sum = num1 - num2;
		System.out.println(sum);
		
		sum = num1*num2;
		System.out.println(sum);
		
		sum = num1 / num2;  // ?? 왜 0일까?
		System.out.println(sum);

	}

}
