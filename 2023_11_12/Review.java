public class Review {
	// 기본타입변수 받아서 결과 리턴하기
	private static void add(int x, int y) {
		 x = x*100;
		 y = y*100;
	}
	// 참조형인 배열받아서 데이터 수정하기, 리턴은 없음
	private static void add(int[] x) {
		// 배열의 첫번째와 두번째 데이터를 더해서 세번째 위치에 저장하기
		x[2] = x[0] + x[1];
	}
	
	public static void main(String[] args) {		
		// 1차원 배열 만들기		
		int[] array = new int[3];	
		int x = 0, y = 20;
		
		// 초기화 하기
		array[0] = 10; array[1] = 20; array[2] = 0;
		
		// 출력해 보기
		System.out.println("메소드전달전 array[2]: "+ array[2]);  // 0
		System.out.println("메소드전달전 x, y : "+ x + " " + y);  // 0
		
		// 매개변수로 메소드에 전달하기
		add(array); add(x,y);  
		
		
		// 전달한 후 배열이 어떻게 변하는지 기본타입변수와 비교하기
		System.out.println("메소드전달후 array[2]: "+ array[2]);  // 30
		System.out.println("메소드전달후 x, y : "+ x + " " + y);  // 0

	}

}
