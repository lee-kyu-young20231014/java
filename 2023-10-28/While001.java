import java.util.Scanner;

public class While001 {
/*
 * 메뉴를 선택하게 하고 선택후 계속할지 물어서 않하겠다고 할때 까지 메뉴 고르기
 */
	public static void main(String[] args) {		
		int choice = 1;
		// 조건  choice가 1,2,3이 아닐때 순환문 종료 
		while ( choice==1 || choice==2 || choice==3  ) {
			System.out.println("1.oooo");
			System.out.println("2.ㅁㅁㅁㅁ");
			System.out.println("3.?????");
			System.out.println("메뉴를 고르세요.. 종료를 원하면 없는 메뉴를 선택하세요");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
		}
		System.out.println("프로그램을 종료합니다.!");

	}

}
