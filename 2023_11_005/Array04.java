import java.util.Scanner;

public class Array04 {
	// 배열을 파라메터로 전달받아서 최대값을 반환하는 함수를 제작  그 함수를 사용
	public static int getMax(int[] scores) {
		int max = scores[0];  // 기준값을 정함
		// 배열에 있는 데이터를 순환하면서 큰값을 변수 max 에 저장
		// for 구문과 if문장이 필요
		for (int i = 0; i < scores.length; i++) {
			if(max < scores[i])
				max = scores[i];
		}
		return max;
	}
	
	public static int[] makeArray() {
		int[] scores = new int[5];  // 정수형 데이터 5개 저장할수 있는 배열 생성		
		Scanner sc = new Scanner(System.in);
		System.out.println("공백을 기준으로 5개의 숫자 입력");
		for (int i = 0; i < 5; i++) {
			scores[i] = sc.nextInt();
		}
		return scores;
	}
	
	public static void main(String[] args) {
		// 사용자로부터 임의의 숫자 5개를 받아서 10 20 30 40 50 
		// 이 값들을 가지는 배열을 만들고
		// 배열에서 가장 큰 값을 찾아라.
		int[] scores = makeArray();

		System.out.println("최대값 : " + getMax(scores));

	}

}








