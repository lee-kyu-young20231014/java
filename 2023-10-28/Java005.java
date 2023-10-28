import java.util.Scanner;

public class Java005 {
	/*
	 * 점수에 따라서 학점부여
	 * 정수형 변수 score에 사용자로부터 입력을 받아서
	 * String str = "A학점";
	 * 점수구간은 90이상 : 89 ~ 80 : B학점...... F
	 */
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		String hakjum = "F학점";
		
		if(score>=90) {
			hakjum  = "A학점"; 
		}else if(score>=80) {
			hakjum  = "B학점";
		}else if(score>=70) {
			hakjum  = "C학점";
		}else if(score>=60) {
			hakjum  = "D학점";
		}else{
			hakjum  = "F학점";
		}
		
		System.out.println("당신의 학점은 "+ hakjum + " 입니다.");
		
	}

}
