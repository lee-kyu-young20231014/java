import java.util.Scanner;

public class Review04 {

	public static void main(String[] args) {
//		두개의 숫자를 입력받아서 다음과 같은 연산의 결과를 각각 출력
//		사칙연산(+-*/), 두 수중에서 큰 값 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("두개의 숫자를 공백을 기준으로 입력하세요(10 20) : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(num1);
		System.out.println(num2);	
		
		System.out.println(num1+num2);

	}

}
