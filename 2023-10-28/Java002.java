import java.util.Scanner;

public class Java002 {
/*
 * 정수형 변수 age로 나이를 입력 받아서
 * 
 * 투표가능한 나이판단  18살이상이면 "18세이상입니다., 투표할수 있습니다.
 * 
 *  if문과 상관없이 "프로그램 종료"
 */
	public static void main(String[] args) {
		int age = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		age = sc.nextInt();
		
		if(age>18) {
			System.out.println("18세이상입니다., 투표할수 있습니다");
		}
		
		System.out.println("프로그램 종료");

	}

}
