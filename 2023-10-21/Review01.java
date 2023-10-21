import java.util.Scanner;

public class Review01 {

	public static void main(String[] args) {
//		배운내용 리스트업
//		연산자
//			단항,이상,삼항,복합대입,논리
//		조건식
//		연산자 우선순위는 ()를 적극적으로 사용해서 외우지 않는다
//		3과목점수와 평균 구하는 연습
//		윤년,평년구분하는 연습
		
//		사용자로부터 나이를 입력받아서 성인인지 구분하는 코드 성인이면 성인입니다. 아니면 성인이 아닙니다 출력
//		Scanner, 삼항연산자
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age= sc.nextInt();
		System.out.println((age>19)? "성인입니다.":"성인이 아닙니다.");
		
	}

}
