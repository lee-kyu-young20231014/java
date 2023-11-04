import java.util.Scanner;

public class Test007 {
	public static void main(String[] args) {
		String result = "회문입니다."; // 결과를 출력할 변수로 기본값으로 회문이라는 문장을 저장
		
		Scanner sc = new Scanner(System.in); // 사용자로부터 값을 받기위한 객체
		System.out.print("문자열입력:"); // 값을 입력하라는 가이드 문자열
		String str = sc.next(); // 실제 키보드로부터 값을 입력받는 구문
		
		// 변수를 여러개 초기화 가능, 그리고 증가 감소도 변수만큰 여러개 사용가능
		// 주어진 문자열의 개수를 이용해서 문자열 갯수만큼 순차적으로 순환하는데
		// 처음부터 읽어오는 i 변수와 끝에서 부터 읽어오는 j 변수를 지정
		// 끝에서부터 읽어올때는 0부터 시작하기때문에 마지막 글자는 길이-1로 해야 한다
		for (int i = 0, j=str.length()-1; i < str.length(); i++, j--) {
			if(str.charAt(i) != str.charAt(j)) { // 처음과 끝에서부터 하나씩 비교해 가면서 틀리면
				result = "회문이 아닙니다."; // 결과를 표시하는 변수에 "회문이 아닙니다"를 저장하고
				break;			// 이미 회문이 아닌상황이 되었기 때문에 더이상 순환할 필요가 없어서 탈출한다
			}
		}		
		System.out.println(result); // 마지막 result 문자열 변수에는 위의 로직에 따라 
//		"회문입니다" 또는 "회문이 아닙니다" 가 출력된다
	}
}
