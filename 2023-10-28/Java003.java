import java.util.Scanner;

public class Java003 {
/*
 * 정수형 변수 num을 선언하고 사용자로부터 값을 입력받아서
 * 짝홀을 구분해서 출력... 짝수,홀수
 * 숫자 % 2 == 0 이면 짝수
 */
	public static void main(String[] args) {
		int num = 0;
		Scanner sc= new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("짝수");
		}		
		else {
			System.out.println("홀수");
		}		
		System.out.println("종료");

	}

}
