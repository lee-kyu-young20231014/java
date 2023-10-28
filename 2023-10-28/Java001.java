import java.util.Scanner;

public class Java001 {
	/*
	 * 정수형 변수 num을 정의하고 값을 사용자로부터 받아서 15보다 크면 "숫자가 15보다 큽니다." 출력
	 * 
	 * if 문과 상관없이 "프로그램 종료" 출력
	 * 
	 * 코드정렬 ctrl+shift+f
	 * 
	 * 이클립스에서 열린문서를 모드 닫는 단축키 ctrl+shift+w 
	 */
	public static void main(String[] args) {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		num = sc.nextInt();

		if (num > 15)
			System.out.println("숫자가 15보다 큽니다.");
		System.out.println("프로그램 종료");

	}

}
