import java.util.Scanner;

public class For003 {
	// 사용자로부터 값을 5번 입력 받아서 그 합을 구해보자
	public static void main(String[] args) {
//		 sum += 사용자로부터 값 받아서
		int sum = 0;  // 반복해서 저장할 변수를 미리 만든다
		
		for (int i = 0; i < 5; i++) {
			System.out.println("정수를 입력하세요");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			sum += num;	
		}
		System.out.println("총 합은 : "+sum);
		
		
	}

}
