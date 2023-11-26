import java.util.Scanner;

public class Exception04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("공백을 기준으로 다양한 문자열을 입력하세요");
//		123 123 ㅁㄴㅇㄻ 123 --> 입력 예 
		String[] str = sc.nextLine().split(" ");
//		hint  try 구문과 순환문을 이용해서 문자열 배열에 있는 정수로 변환가능한 문자열숫자를
//		Integer.valueOf("123");
//		전부 정수로 변환해서 그 합을 구해보세요.
		int total = 0;
		for (int i = 0; i < str.length; i++) {
			try {
				total += Integer.valueOf(str[i]); // 정수변환 시도
				
			}catch (Exception e) {
				System.out.println("이 문장을 정수로 변환 안됨 : " + str[i]);
			}
		}
		System.out.println("정수들의 총 합은 : "+total);

	}

}
