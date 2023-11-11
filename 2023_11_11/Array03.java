public class Array03 {
// 두개의 2차원 배열을 받아서 각각의 합을 구한 새로운 2차원 배열을 리턴하는 메소드
	public static int[][] Sum(int[][] x, int[][] y){
		int rows = x.length;
		int columns = x[0].length;
		int[][]sum = new int[rows][columns];
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[i].length; j++) {
				sum[i][j] = x[i][j] + y[i][j];
			}
		}
		return sum;
	}
	// 출력
	public static void displayArray(int[][] x) {
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				System.out.print(x[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// 3개짜리 1차원배열을 두개 가지는 2차원 배열을 만들어서
		// 각각의 2차원배열을 행렬로 생각하고 행렬 연산
		// 합을 구하고 --> 이중for문 이라서 코드가 길다.
		// 출력을 한다. --> 이중for문 이라서 코드가 길다.
		
		// 합을구하는 로직과
		// 출력하는 로직을 구분해서 사용한다. --> 메소드
		int rows=2,columns=3;
		// 데이터 초기화
		int firstMatrix[][] = {{2,3,4},{3,2,1}};
		int[][] secondMatrix = {{1,2,3},{-4,-2,1}};
		int[][] sum = Sum(firstMatrix, secondMatrix);
		displayArray(sum);

	}

}
