
public class Array02 {

	public static void main(String[] args) {
		//  값을 가지고 배열 생성
		double[] gradeArr = {90,705,80,79,72.5,50,70,90.2,89.5,89.7,12,15,4,85};
		// 배열의 모든 요소의 합을 저장할 변수  
		double sum = 0.0;
		// 배열의 모든 요소를 순환하면서  sum변수에 누적
		for (int i = 0; i < gradeArr.length; i++) {
			sum += gradeArr[i];
		}
		// 총합이 구혀졌으니 평균을 구한다
		double average = sum / gradeArr.length;
		System.out.println("합계 " + sum);
		System.out.format("평균 : %.2f\n", average);  // 문자열에서 \n 은 줄바꿈 명령어
		System.out.println(average);

	}

}
