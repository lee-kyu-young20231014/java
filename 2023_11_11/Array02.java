import java.util.Iterator;
import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		// 각각의 학생들은 2과목 점수를 가지고 있고 학생은 2명
		// 2 by 3
		// 1.실수형태의 2차원배열을 만들고 
		// 2.2차원배열에 데이터를 채워 넣고
		// 3.각 배열의 첫번째와 두번째는 점수를 넣고 마지막에는 평균을 넣자
		
		double[][] scores = new double[2][3];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println("학생번호 : "+ (i+1) );
			System.out.println("국어");
			scores[i][0] = sc.nextDouble();
			System.out.println("수학");
			scores[i][1] = sc.nextDouble();			
			scores[i][2] = (scores[i][0] + scores[i][1])/2;			
		}
		// 출력... 1번학생 국어:00, 수학:00 평균:00 
		for (int i = 0; i < scores.length; i++) {
			String printStr = String.format("%d번학생 국어:%f 수학:%f 평균:%.2f", 
					i+1, scores[i][0], scores[i][1], scores[i][2]);
			System.out.println(printStr);
		}
		
		

	}

}
