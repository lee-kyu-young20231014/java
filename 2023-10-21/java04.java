/*
 * 관계연산자  결과가 참(true) 거짓(false)의 결과를 가진다
 *  >, <, >=, <=, ==, != 
 * 
 * 논리 연산자 : 두개이상의 연산의 결합(논리곱, 논리합)
 * 0은 거짓(false)이고 나머지 숫자는 참(true)
 * 논리곱 : &&  곱하기 : ~이고 ~이다
 * T && T --> T
 * T && F --> F
 * F && T --> F
 * F && F --> F 
 * 
 * 논리합 : ||  더하기  : ~이거나, 또는
 * T || T --> T
 * T || F --> T
 * F || T --> T
 * F || F --> F
 */
public class java04 {

	public static void main(String[] args) {
//		관계연산자
		int age = 20;
		System.out.println(age>20);  // 변수 age의 값이 20보다 크면 true
		System.out.println(age<100);
		System.out.println(age>=20);
		System.out.println(age<=100);
		System.out.println(age==100);
		System.out.println(age!=100);
//		논리연산자
		int kor=20,eng=99,math=100;
		int avg = (kor+eng+math) / 3;
//		합격조건이 평균60이상이고 각과목별 40점이상일때 합격
		System.out.println(avg>=60 && kor>=40 && eng>=40 && math>=40);
//		System.out.println(10 < age < 100);
		System.out.println( ( 10<age ) && ( age<100 ) );
//		윤년여부를 관계연산자와 논리연산자를 통해 판단
//		율리우스력의 윤년 추가 규칙은 다음과 같다.
//		4로 나누어 떨어지는 해는 윤년, 그 밖의 해는 평년으로 한다.
//		필요한 변수  int year;
		int year = 2023;
//		year % 4 == 0
		
//		그레고리력은 다음과 같은 예외 규칙을 추가하였다.
//		100으로 나누어 떨어지되 400으로 나누어 떨어지지 않는 해는 평년으로 한다.
//		!(year % 100 ==0 || year%400 !=0)
		
//		위의 두 조건을 더하면
		boolean check= (year % 4 == 0) || ( !(year % 100 ==0 || year%400 !=0) );
		System.out.println(check);		
	}
}
