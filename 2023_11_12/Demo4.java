import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		FishBred f = new FishBred();  // 기본생성자를 호출해서 객체를 생성
		f.type = "팥";
		f.price = 500;
		f.mix(); f.oven();
		
		FishBred f2 = new FishBred();
		f2.setPrice(550);
		f2.type = "크림";
		f2.mix(); f2.oven();
		
		String str = "문자열";
//		String str = new String("문자열"); // 매개변수 "문자열"을 생성자에게 전달해서 객체생성
		
		Scanner sc = new Scanner(System.in);// 매개변수 System.in을 생성자에게 전달해서 객체생성
		
		// 문자자체를 쓰면 대부분 변수
		// 문자() 이런형태면... 메소드 호출
	}

}
