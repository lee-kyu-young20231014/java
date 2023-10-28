/*
 * 정수 num과 n이 매개 변수로 주어질 때, 
 * num이 n의 배수이면 1을 return 
 * n의 배수가 아니라면 0을 return하도록 
 * solution 함수를 완성해주세요.
 * 
 * num	n	result
	98	2	1
	34	3	0
	
입출력 예 설명
입출력 예 #1

98은 2의 배수이므로 1을 return합니다.
입출력 예 #2

32는 3의 배수가 아니므로 0을 return합니다.	
 */

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// 두개의 정수 m과 n을 입력받아서
		System.out.println("두개의정수 m 과 n을 공백으로 구분해서 입력");
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		if(m % n ==0) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		

	}

}
