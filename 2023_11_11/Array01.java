import java.util.Scanner;

public class Array01 {

	public static void main(String[] args) {
//		String[] myArr = new String[3];  // 초기값은 Null
		String[] myArr = {"","",""}; // 초기값은 공백
		
		Scanner sc = new Scanner(System.in);
		System.out.println("3개의 문자열을 입력하세요");
		
		//배열에 데이터를 입력
		for (int i = 0; i < 3; i++) {
			myArr[i] =  sc.nextLine();
		}
		
		// 출력
		for (int i = 0; i < 3; i++) {
			System.out.println(myArr[i]);
		}		
	}
}
