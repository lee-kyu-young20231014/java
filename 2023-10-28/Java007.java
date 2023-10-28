import java.util.Scanner;

public class Java007 {
/*
 * 사용자로부터 3개의 정수를 입력받아서 첫번째값이 가장큰지 판단
 * 가장크면 x는 가장큰 값입니다.
 */
	public static void main(String[] args) {
		System.out.println("공백을 기준으로 3개의 정수를 입력하세요(10 20 30)");
		Scanner sc = new Scanner(System.in);
		int num1 =  sc.nextInt();
		int num2 =  sc.nextInt();
		int num3 =  sc.nextInt();
		
		if(num1 > num2) {
			if(num1 > num3) {
				System.out.println(num1 + "이 가장 큰 수입니다.");
			}
		}
		
		if( num1> num2 && num1>num3) {
			System.out.println(num1 + "이 가장 큰 수입니다.");
		}
		
		

	}

}
