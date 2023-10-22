/*
 * 제어 if, if~else
 * if(조건식){ 조건식이 참일때 수행되는 문장}
 * if(조건식){조건식이 참일때 수행되는 문장}else{조건식이 거짓일때 수행되는 문장}
 * 
 * if(조건식)
 * {조건식이 참일때 수행되는 문장}
 * else if(조건식2)
 * {조건식이 거짓일때 중에서 다시 조건을 걸때 그 조건이 만족하면 수행되는 문장}
 * else
 * {그 밖의 나머지  ...}
 */

/*
 * 입장료 계산 프로그램
 * 나이가 8살 미만이면  취학전 아동
 * 나이가 9~13 : 초등학생
 * 14 ~ 19 : 중고생
 * 20~ 일반인
 * 이라고 출력하는 프로그램
 */

import java.util.Scanner;

public class Java01 {
	public static void main(String[] args) {
		int charge = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age =  sc.nextInt(); // 콘솔로부터 사용자가 입려하고 엔터치면 값을 가져온다
		if(age < 8) {
			System.out.println("취학 전 아동");			
		}else if(age < 14) {
			System.out.println("초등학생");
			charge = 1000;
		}else if(age < 20) {
			System.out.println("중고생");
			charge = 3000;
		}else {
			System.out.println("일반인");
			charge = 10000;
		}
		System.out.println("입장료는 " + charge + "원 입니다.");
		
	}

}
