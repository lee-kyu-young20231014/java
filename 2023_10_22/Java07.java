import java.util.Scanner;

public class Java07 {

	public static void main(String[] args) {
//	 온도를 측정해서 값의 범위에 따라서 다음과 같이 상태를 설정한다
//		설정된 상태에 따라서 적절한 동작을 한다.
//		온도가 0~40 : 안정
//		41 ~ 80 : 불안정
//		81 ~  100:위험
//		101 ~ : 매우위험
//		안정이면... 아무조치안함, 불안정이면 "주의"출력, 위험 : "경고"출력, 매우위험:"시스템 종료"
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 온도를 입력하세요(0~) : ");
		int data = sc.nextInt();
		String state = "안정";
		
		if(data <=40) {
			state = "안정";
		}else if(data <=80) {
			state = "불안정";
		}else if(data <=100) {
			state = "위험";
		}else {
			state = "매우위험";
		}
		////////////// stete 값에 따른 사후조치
		switch (state) {
		case "안정":
			System.out.println("아무조치 안함");
			break;
		case "불안정":
			System.out.println("주의");
			break;
		case "위험":
			System.out.println("경고");
			break;
		case "매우위험":
			System.out.println("시스템 종료");
			break;
		default:
			break;
		}
		
		
	}

}




