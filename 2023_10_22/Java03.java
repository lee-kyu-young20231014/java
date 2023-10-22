import java.util.Scanner;

public class Java03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		// 점수가 90~ A학점, 80~89 B학점..... A,B,C,D,F
		String rank = "";
		if(score>=90) {
			rank = "A";
		}else if(score >= 80) {  // 80 81 82 ~ 89
			rank = "B";
		}else if(score >= 70) {
			rank = "C";
		}else if(score >= 60) {
			rank = "D";
		}else {
			rank = "F";
		}
		System.out.println("학점은 : "+rank+" 입니다.");

	}

}
