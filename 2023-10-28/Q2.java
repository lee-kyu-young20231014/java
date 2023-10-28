import java.util.Scanner;

public class Q2 {
	
	/*
	 * 부분 문자열이란 문자열에서 연속된 일부분에 해당하는 문자열을 의미합니다. 
	 * 예를 들어, 문자열 "ana", "ban", "anana", "banana", "n"는 
	 * 모두 문자열 "banana"의 부분 문자열이지만, 
	 * "aaa", "bnana", "wxyz"는 모두 "banana"의 부분 문자열이 아닙니다.

	문자열 my_string과 target이 매개변수로 주어질 때, 
	target이 문자열 my_string의 부분 문자열이라면 1을, 
	아니라면 0을 return 하는 solution 함수를 작성해 주세요.

	my_string	target	result
	"banana"	"ana"	1
	"banana"	"wxyz"	0
	*/	
	
	public static void main(String[] args) {		
		String my_string = "banana";
		String target ="wxyz";
		// 참조형 변수 String, Scanner.... -->나중에 나온 타입
		// 기본형 변수(primitive type) int float byte short....	
		
		boolean isContinue = true;  // 참과 거짓을 판단하는 변수는 is로시작한다. 
		while (isContinue) {
			System.out.println("원본 문자열을 입력하세요");
			Scanner sc = new Scanner(System.in);
			my_string =  sc.next();
			System.out.println("타겟 문자열을 입력하세요");
			target = sc.next();				
			if (my_string.contains(target)) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}			
			System.out.println("계속안할거면 y/Y를입려하세요 : ");
			String str = sc.next();
			if(str.equals("y") || str.equals("Y")) 
			{
				isContinue = false;
			}
		}	
	}
}
