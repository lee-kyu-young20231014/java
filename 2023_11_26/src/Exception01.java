import java.util.Scanner;
// 1. 올바른 값이 입력되도록 순환문형태로 변경
// 2. 사용자로부터 값을 입력받아서 정수로 반환하는 메소드
// 3. 1,2번이 되면 사용자 정의 scanner의 역활을 하는 클래스를 만들기
public class Exception01 {

	public static int getInputNumber(int trycount) {
		int num = 0; // 리턴할 변수
		int count =0; // 사용자로부터 받은 시도 횟수보다 크면 중지하도록 하는 변수
		while(count < trycount) {
			try {
				Scanner sc = new Scanner(System.in);
				String strNum =  sc.nextLine();
				num = Integer.valueOf(strNum);
				break;
			}catch (Exception e) {
				System.out.println("잘못입력 했습니다.");
			}
		}		
		return num;
	}
	
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");	
		while(true) {
			int num1 = getInputNumber(10);		
			try {
				int num2 = 10 / num1;
				System.out.println(num2);
				break;
			} catch (Exception e) {
				System.out.println("올바른 숫자를 입력하세요");			 
			}			
		}
		
		System.out.println("try~catch 블록의 외부 문장입니다.");

	}

}
