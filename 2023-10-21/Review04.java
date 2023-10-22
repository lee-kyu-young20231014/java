import java.util.Scanner;

public class Review04 {

	public static void main(String[] args) {
//		두개의 숫자를 입력받아서 다음과 같은 연산의 결과를 각각 출력
//		사칙연산(+-*/), 두 수중에서 큰 값 출력 - 삼항연산자
		Scanner sc = new Scanner(System.in);
		System.out.print("두개의 숫자를 공백을 기준으로 입력하세요(10 20) : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(num1);
		System.out.println(num2);	
		
		System.out.println(num1+num2);
		// 나머지 구현...
		// 두 수중에 가장 큰 수
		int maxnum = (num1 > num2)? num1 : num2;
		System.out.println("입력하신 숫자중에 가장 큰 수는 : ");
		System.out.println(maxnum);
		
		
		
		

	}

}
