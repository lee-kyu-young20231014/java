import java.util.Scanner;

public class Array01 {
/*
 * 모든변수는 사용하기전에 반드시 초기화를 해야 한다.
 */
	public static void main(String[] args) {
//		String[] myArr;
//		myArr = new String[3];
		
				
		String[] myArr = new String[3];	// 배열변수(객체)생성 - new 를 이용해서 할당	
		// 배열은 초기화가 자동으로 되는데. 아무것도 없다는 뜻인 null 로 초기화
		
//		배열의 각 인덱스에 데이터입력
//		System.out.println("3개 문자열을 입력하세요");		
//		Scanner sc = new Scanner(System.in);
//		for (int i = 0; i < 3; i++) {
//			myArr[i] =  sc.nextLine();			
//		}
		
		System.out.println("-------------- 배열의 값을 출력 -------------------");
		for (int i = 0; i < myArr.length; i++) {
			System.out.print(myArr[i]+" ");
		}
		
	}

}
