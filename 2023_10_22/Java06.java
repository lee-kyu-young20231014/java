
public class Java06 {

	public static void main(String[] args) {
//		switch ~ case 는 case by case 라고 이해 해당 케이스를 실행
		
//		value 가 1이면 case 1에 해당하는 내용을 실행하고 switch문장을 종료
//		그런데 break가 없으면 break를만날때까지 나머지 case 문도 실행한다
//		switch (value) {
//		case 1:
//			break;
//		case 2:
//			break;
//		default:
//			break;
//		}
		int rank = 2;
		switch (rank) {
		case 1:
			System.out.println("1등");
//			break;
		case 2:
			System.out.println("2등");
//			break;	
		case 3:
			System.out.println("3등");
			break;
		default:
			System.out.println("1,2,3등을 제외한 나머지 등수");
			break;
		}

	}

}
