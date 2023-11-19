import java.util.Scanner;

public class Welcome {	
	// 상수선언 : 상수는 선언과 동시에 잠김 , 데이터는 반드시 선언과 동시에 초기화
	static final int NUM_BOOK = 3;  // ROW
	static final int NUM_ITEM = 7; // COL
	
	public static void menuIntroduction() {
		System.out.println("-------------------------------");
		System.out.println("1. 고객정보 확인하기\t\t 4. 장바구니에 항목 추가하기");
		System.out.println("2. 장바구니 확인하기\t\t 5. 장바구니에 항목 수량 줄이기");
		System.out.println("3. 장바구니  비우기\t\t 6. 장바구니에 항목 삭제하기");
		System.out.println("7. 영수증  표시하기\t\t 8. 종료");
		System.out.println("-------------------------------");
	}
	
	// System.out.println("이름:"+name+" 연락처:"+phone);
	public static void menuGuestInfo( Person p ) {
		System.out.format("이름 : %s  연락처 : %s  주소 : %s\n", p.getName(), p.getPhone(), p.getAddress());
	}
	// 2. 장바구니 확인하기 메소드 
	public static void menuCartItemList() {}
	// 3. 장바구니 비우기
	public static void menuCartClear() {}
	// 4. 장바구니에 항목 추가하기
	// 2차원 문자열 배열을 전달하면 해당 배열의 내용을 채운다  2x7형태의 2차원 배열전달
	public static void menuCartAddItem(String[][] book) 
	{
		BookLists(book);  // 상품초기화(도서관에 있는 책들.....)
		// 책들을 출력
		for (int i = 0; i < NUM_BOOK; i++) {
			for (int j = 0; j < NUM_ITEM; j++) {
				System.out.print(book[i][j]+" | ");
			}
			System.out.println();
		}
		// 장바구니에 항목을 추가하지 않을때까지 반복
		boolean quit = false; // 사용자가 취소할때
		boolean findFlag = false; // 원하는 아이디를 찾으면
		while(!quit & !findFlag) {
			System.out.println("장바구니에 추가할 도서의 ID를 입력하세요");
			Scanner sc = new Scanner(System.in);
			String inputIsbn = sc.nextLine();
			// 3권중에 골라야 하기 때문에.. 기존 책들의 id과 입력한 id가 같은지 확인
			// 찾으면  flag를 true로 설정하고 몇번째 책인지 배열의 인덱스를 기록
			int bookIdx = -1; // 검색전 초기값
			for (int i = 0; i < NUM_BOOK; i++) {
				if(inputIsbn.equals(book[i][0])) {
					bookIdx = i;
					findFlag= true;
					break;
				}
			}
			// 순환한다음 원하는 책이 있으면  findFlag 는 true 이다
			// 이때 이 상품을 추가할지 물어봐야 한다.
			if(findFlag) {
				System.out.println("장바구니에 추가하겠습니까? Y or N");
				String str =  sc.nextLine();
				if(str.toUpperCase().equals("Y")) {
					System.out.println(book[bookIdx][0]+" 책이 추가되었습니다.");
				}
			}
			
		}
		
	}
	// 5.장바구니 항목 수량줄이기
	public static void menuCartRemoveItemCount() {}
	// 6.장바구니 항목 삭제하기
	public static void menuCartRemoveItem() {}
	// 7. 영수증 표기하기
	public static void menuCartBill() {}
	// 8. 종료
	public static void menuExit() {
		System.out.println("8. 종료");
	}
	
	// 책 정보를저장하는 메소드
	public static void BookLists(String[][] book) {
		book[0][0] = "ISBN1234";
		book[0][1] = "자바책";
		book[0][2] = "27000";
		book[0][3] = "이규영";
		book[0][4] = "차근차근 배워나가는 자바";
		book[0][5] = "IT전문서적";
		book[0][6] = "2023/11/11";
		
		book[1][0] = "ISBN5678";
		book[1][1] = "자바책2";
		book[1][2] = "37000";
		book[1][3] = "홍길동";
		book[1][4] = "자바책";
		book[1][5] = "IT전문서적";
		book[1][6] = "2023/11/11";
		
		book[2][0] = "ISBN6789";
		book[2][1] = "자바책3";
		book[2][2] = "17000";
		book[2][3] = "홍길동2";
		book[2][4] = "자바책2";
		book[2][5] = "IT전문서적";
		book[2][6] = "2023/11/11";
	}
	
	public static void main(String[] args) {		
		String[][] mBook = new String[NUM_BOOK][NUM_ITEM];
		
		Scanner sc = new Scanner(System.in);
		
		// 고객정보를 가지는 클래스의 객체를 생성한다
		Person customer = new Person();
		System.out.print("당신의 이름을 입력하세요 : ");
		customer.setName( sc.nextLine() );
		System.out.print("연락처를 입력하세요 : ");
		customer.setPhone( sc.nextLine());
		System.out.println("주소를 입력하세요");
		customer.setAddress(sc.nextLine());
		
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
				menuGuestInfo(customer);  // 고객 정보 확인 메소드 호출
				break;
			case 2:		
				menuCartItemList();
				break;
			case 3:				
				menuCartClear();
				break;
			case 4:		
				menuCartAddItem(mBook);
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
