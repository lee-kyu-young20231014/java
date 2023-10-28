import java.util.Scanner;

public class Switch001 {
/*
 * 사용자로부터 숫자를 1~7사이의 정수르 입력받아서
 * 1이면 "월요일"..... 7이면 "일요일" 출력
 */
	public static void main(String[] args) {
		System.out.println("1~7사이읫숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		switch (num) {
		case 1:	System.out.println("월요일"); break;
		case 2:	System.out.println("화요일"); break;
		case 3:	System.out.println("수요일"); break;
		case 4:	System.out.println("목요일"); break;
		case 5:	System.out.println("금요일"); break;
		case 6:	System.out.println("토요일"); break;
		case 7:	System.out.println("일요일"); break;
		default:
			System.out.println("1~7을 제외한 숫자");
			break;
		}

	}

}
