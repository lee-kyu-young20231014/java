public class Test009 {
/*
 * 연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
 *  12와 3이 주어지면 아래와 같이 두개의 수를 만든다
	12 ⊕ 3 = 123
	3 ⊕ 12 = 312
	양의 정수 a와 b가 주어졌을 때, a ⊕ b와 b ⊕ a 중 더 큰 값을 return 하는 solution 함수를 완성해 주세요.
	단, a ⊕ b와 b ⊕ a가 같다면 a ⊕ b를 return 합니다.
	
	a	b	result
	9	91	991
	89	8	898	
 */
	public static int solution(int x, int y) {
		int result = 0;
		// 로직
		String xstr = String.valueOf(x);
		String ystr = String.valueOf(y);
		int intx = Integer.valueOf(xstr+ystr);
		int inty = Integer.valueOf(ystr+xstr);
		result = (intx > inty)? intx : inty;		
		return result;
	}
	public static void main(String[] args) {
		int x = 10, y= 20;
		// 1020, 2010
		// 1. 각각의 숫자를 문자열로 변경한후 문자열을 합친다.
		// 2. 1번의순서를 반대로 각각의 숫자를 문자열로 변경한후 문자열을 합친다.
		// 3. 1번과 2번의 문자열을 숫자로 변경한다.
		// 4. 두 수중에 가장 큰 수를 반환한다
//		String xstr = String.valueOf(x);
//		String ystr = String.valueOf(y);
//		int intx = Integer.valueOf(xstr+ystr);
//		int inty = Integer.valueOf(ystr+xstr);
//		int max = (intx > inty)? intx : inty;
		System.out.println(  solution(x, y)   );		
	}

}
