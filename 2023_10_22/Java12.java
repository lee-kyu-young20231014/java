import java.util.Scanner;

public class Java12 {

	public static void main(String[] args) {
//		8번에서 작성한 메뉴를 가지고 3번선택할수있게 해서 사용자가 선택한 메뉴들의 총 합을 출력
//		System.out.println("1.짜장면 : 6000");
//		System.out.println("2.짬봉 : 7000");
//		System.out.println("3.탕수육 : 25000");
//		System.out.println("4.우동 : 9000");		
//		System.out.print("메뉴를 선택하세요(1~4) :");

//		1. 3번 반복하는 로직을 만든다
//		2. 반복문에  6번~10라인의 코드를 넣어서 반복시킨다
//		3. 반복문 안에서 선택한 메뉴에 대한 가격을 sum이라는 미리 만들어 놓은 변수에 누적시킨다
//		4. 순환문이 끝나면 총 합을 구해서 출력한다.
//		필요한 명령어 
		
		Scanner sc = new Scanner(System.in);
		int sum = 0; // 총 음식값
		
		int count = 0;
		while (count < 3) {			
			// 로직
			System.out.println("1.짜장면 : 6000");
			System.out.println("2.짬봉 : 7000");
			System.out.println("3.탕수육 : 25000");
			System.out.println("4.우동 : 9000");		
			System.out.print("메뉴를 선택하세요(1~4) :");
			int choiceMenu = sc.nextInt();
			switch (choiceMenu) { // 값에 따라서
			case 1:		
				sum += 6000;
				break;
			case 2:			
				sum += 7000;
				break;
			case 3:			
				sum += 25000;
				break;
			case 4:			
				sum += 9000;
				break;
			default:
				System.out.println("올바른 메뉴를 선택해 주세요");
				break;
			}
			if(count>=1 && count <=4) {  // 조건에 따라서 
				count++;	
			}			
		}		
		System.out.println("주문한 음식의 총 합은 : "+sum+"원 입니다.");
	}

}
