import java.util.Scanner;

public class Java004 {
/*
 * 사용자로부터 10 15 20 중에 하나를 입력받아서 정수형 변수 num에 저장
 * 조건문을 이용해서 num이 10이면 "숫자가 10입니다." 출력하는 나머지도 같게
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num =  sc.nextInt();
		if(num == 10) {
			System.out.println("숫자가 10입니다.");
		}else if(num == 15) {
			System.out.println("숫자가 15입니다.");
		}else if(num == 20) {
			System.out.println("숫자가 20입니다.");
		}else {
			System.out.println("10,15,20을 제외한 정수 입니다.");
		}	
		System.out.println("if문과 상관 없는 문장");		
	}
}
