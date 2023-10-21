import java.util.Scanner;

public class Review03 {

	public static void main(String[] args) {
//		사용자로부터 정수형 점수 3개를 입력받아서(각각을 과목이라고 한다)
//		합격 불합격여부 출력 (평균 60점 이상 과락 40점이상)
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 입력 : ");
		int kor = sc.nextInt();
		System.out.print("영어 입력 : ");
		int eng = sc.nextInt();
		System.out.print("수학 입력 : ");
		int math = sc.nextInt();
		int avg = (kor+eng+math)/3;
		boolean isPass = (avg >=60) && (kor>=40) && (eng>=40) && (math>=40);
		System.out.println( (isPass)? "합격" : "불합격" );
	}

}
