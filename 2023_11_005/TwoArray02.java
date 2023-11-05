public class TwoArray02 {

	public static void main(String[] args) {
		// 2정수형  2차원 배열을 임의로 만들면서 초기화
		int[][] ary = { {0,1,2},{3,4,5}  };  // 2 x 3 
		
//		for (int i = 0; i < ary[0].length; i++) {
//			System.out.println(ary[0][i]);
//		}
//		
//		for (int i = 0; i < ary[1].length; i++) {
//			System.out.println(ary[1][i]);
//		}
//		 1차원배열의 개수인 length는 1차원을 구성하는 원소의 개수이다.
//		 2차원배열의 개수인 length는 2차원을 구성하는 원소의 개수이다. 즉 1차원 배열의 개수 다시 로우(row)행의 개수를 의미
		for (int j = 0; j < ary.length; j++) {  // ary.length --> 2
			for (int i = 0; i < ary[j].length; i++) { // ary[i].length -->3 
				System.out.println(ary[j][i]);
			}
		}
		
		

	}

}
