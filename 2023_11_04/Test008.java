import java.util.Scanner;

public class Test008 {

	
	
	public static void main(String[] args) {
//		String.valueOf(값)  -> 문자열로 변환
//		Double.valueOf("3.14") --> 실수 3.14로 변환
//		Integer.valueOf("123") --> 정수 123로 변환
		
		//1. 사용자로부터 문자열을 입력받아서
		// 두개를 붙여서 출력   applepen
		// 공백을 넣어서 출력   apple pen
		Scanner sc = new Scanner(System.in);
		System.out.println("두개의 문자열을 입력하세요");
		String str1 = sc.next();
		String str2 = sc.next();
		System.out.println(str1+str2); System.out.println(str1+" "+str2);
		
		
		//2. 길이가 같은 두개의 문자열을 서로 번갈아 가면서 출력  for문가  charAt(i)		
		String str3 = "aaaaa";
		String str4= "bbbbb";
		String result = "";
		
		for (int i = 0; i < str3.length(); i++) {
			result += String.valueOf( str3.charAt(i) ) + String.valueOf( str4.charAt(i) );
		}
		System.out.println(result);
		
		//3. 문자열과 숫자가 주어지면 해당 문자열을 숫자만큼 반복해서 출력
//		 love 2  --> lovelove 
		String str5 = "love";
		int count = 5;
		for (int i = 0; i < count; i++) {
			System.out.print(str5);
		}

	}

}
