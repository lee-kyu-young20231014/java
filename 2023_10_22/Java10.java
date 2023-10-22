
public class Java10 {

	public static void main(String[] args) {
//		10까지 더한 값을 구할때 순환문을 응용
//		int sum = 0+1+2+3+4+5+6+7+8+9+10+11+12+13+14+15; // 음.!!! 100까지 이걸.......
		int sum = 0;  // 0부터 100까지 더한 결과를 저장할 변수로 sum 초기화

		// 순환문을 100번 반복하도록 설계
//		순환문을 제어하는 변수 선언하고 초기화
		int count = 0;
		while (count<=100)  // 제어변수와 함께 조건을 설정 
		{
			sum += count;
			
			count++;
		}
		System.out.println(sum);


	}

}
