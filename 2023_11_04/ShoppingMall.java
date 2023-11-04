import java.util.Scanner;

public class ShoppingMall {

	public static void menuIntroduction() {
		System.out.println("-------------------------------");
		System.out.println("1. 고객정보 확인하기\t\t 4. 장바구니에 항목 추가하기");
		System.out.println("2. 장바구니 확인하기\t\t 5. 장바구니에 항목 수량 줄이기");
		System.out.println("3. 장바구니  비우기\t\t 6. 장바구니에 항목 삭제하기");
		System.out.println("7. 영수증  표시하기\t\t 8. 종료");
		System.out.println("-------------------------------");
	}
	
	// System.out.println("이름:"+name+" 연락처:"+phone);
	public static void menuGuestInfo( String name , String phone ) {
		System.out.println("이름:"+name+" 연락처:"+phone);
	}
	// 2. 장바구니 확인하기 메소드 
	public static void menuCartItemList() {}
	// 3. 장바구니 비우기
	public static void menuCartClear() {}
	// 4. 장바구니에 항목 추가하기
	public static void menuCartAddItem() {}
	// 5.장바구니 항목 수량줄이기
	public static void menuCartRemoveItemCount() {}
	// 6.장바구니 항목 삭제하기
	public static void menuCartRemoveItem() {}
	// 7. 영수증 표기하기
	public static void menuCartBill() {}
	// 8. 종료
	public static void menuExit() {}
	
	
	
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 이름을 입력하세요 : ");
		String name = sc.next();
		System.out.print("연락처를 입력하세요 : ");
		String phone = sc.next();
		System.out.println("-------------------------------");
		System.out.println("Welcome to Shopping Mall");
		System.out.println("Welcome to Book Market!");
		
		int choiceNum = 0;
		while (choiceNum != 8 ) {			
			menuIntroduction();				
			System.out.print("메뉴 번호를 선택하세요 : ");
			choiceNum = sc.nextInt();
			if(choiceNum>8 | choiceNum<1) {
				System.out.println("1과8사이의 숫자를 입력하세요");
				continue;
			}
				
			switch (choiceNum) {
			case 1:  // 1. 고객정보 확인하기	
				menuGuestInfo(name,phone);  // 고객 정보 확인 메소드 호출
				break;
			case 2:		
				menuCartItemList();
				break;
			case 3:				
				menuCartClear();
				break;
			case 4:		
				menuCartAddItem();
				break;
			case 5:	
				menuCartRemoveItemCount();
				break;
			case 6:	
				menuCartRemoveItem();
				break;
			case 7:	
				menuCartBill();
				break;	
			case 8:
				menuExit();
				break;
			default:
				break;
			}
		}
		
		

	}

}
