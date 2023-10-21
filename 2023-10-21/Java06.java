/*
 * 사용자로부터 데이터를 받기
 * Scanner라는 클래스를 이용
 * 여기서 클래스는 그냥 입력을 받기위해 사용했다 라고만 알고 씁시다..
 */

import java.util.Scanner;

public class Java06 {

	public static void main(String[] args) {
//		사용자 입력을 받기위한 준비
		Scanner sc = new Scanner(System.in);  // 외부로 부터 데이터 입력을 위한 준비
		System.out.print("점수를 입력하세요: "); // 안내문
		int score= sc.nextInt(); // 실제동작하는 부분 콘솔창에서 사용자 입력을 대기
		System.out.println(score);
	}

}
