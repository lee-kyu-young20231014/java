import java.util.Scanner;

public class Java006 {
/*
 * 중첩 if문  
 * 사용자로부터 정수형 값을 입력받아서 저장한후 그 값이 100보다 작으면 
 * "100보다 작다"  출력 그리고 100보다 작으면서 50보다크면 "50보다 큽니다."
 */
	public static void main(String[] args) {
		System.out.println("정수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num <100) {
			System.out.println("100보다 작다");
			if(num >50) {
				System.out.println("50보다 큽니다");
			}
		}
	}

}
