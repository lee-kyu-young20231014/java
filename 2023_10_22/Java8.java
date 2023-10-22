import java.util.Scanner;

public class Java8 {
/*
 * 화면에 메뉴를 출력
 * 1.짜장면 : 6000 
 * 2.짬봉 : 7000
 * 3.탕수육 : 25000
 * 4.우동 : 9000
 * 메뉴를 선택하세요(1~4)
 * 
 * 사용자에게 메뉴를 입력받아서 1~4번이 아닌 숫자가 오면 잘못입력했습니다. 출력
 * 정상입력이면 각 메뉴에 해당하는 가격을 출력
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.짜장면 : 6000");
		System.out.println("2.짬봉 : 7000");
		System.out.println("3.탕수육 : 25000");
		System.out.println("4.우동 : 9000");		
		System.out.print("메뉴를 선택하세요(1~4) :");
		
		int choiceNum = sc.nextInt();
		switch (choiceNum) {
		case 1:		
			System.out.println("6000원 입니다.");
			break;
		case 2:			
			System.out.println("7000원 입니다.");
			break;
		case 3:			
			System.out.println("25000원 입니다.");
			break;
		case 4:			
			System.out.println("9000원 입니다.");
			break;
		default:
			System.out.println("올바른 메뉴를 선택해 주세요");
			break;
		}
		  
		 
	}

}
