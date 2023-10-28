
public class For004 {
/*
 * 구구단중에 4단을 출력
 * 4 x 1 = 4
 * 4 x 2 = 8
 * 4 x 3 = 12
 * ..
 * 4 x 9 = 36
 */
	/*
	 * 패턴을 가지고 반복되는 작업은 ---> 순환문 형태로 표현한다. 
	 * 고정된표현(값) : 그냥 사용 
	 * 변하는표현(값) : 변수에 담아서 사용
	 * 한가지상황을 변수와 함께 만들어서... 그걸... 순환문에 적용
	 */
	public static void main(String[] args) {
//		int num1 = 1;		
//		System.out.println("4 x "+num1+" = " + 4*num1);  // num1 1
//		num1 = 2;
//		System.out.println("4 x "+num1+" = " + 4*num1);  // num1 1
				
		for (int i = 1; i < 10; i++) {
			System.out.println("4 x "+i+" = " + 4*i);  // num1 1
		}

	}

}
