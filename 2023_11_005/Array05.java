
public class Array05 {
	// 다양한 배열을 출력하는 메소드. 메소드 이름은 통일시키는게 좋을거 같음
	// displayArray 메소드 이름으로 통일해서 문자열과,정수와,실수의 배열을 출력하는 메소드 3개를 같은 이름으로 만들어주세요
	// overload
	
	public static void displayArray(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static void displayArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static void displayArray(double[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	
	public static void main(String[] args) {
		// 1차원 배열만들기 
		// 정수형 1차원배열(정수형 배열)
		// 문자열 배열 에 문자열 3개를 저장 , 문자열은 아무거나.  String
		// 정수형 3개  int
		// 실수형 3개  double
//		String[] strArray = {"고기","밥","떡"};
//		int[] intArray = {10,20,30};
//		double[] doubleArray = {11.5,22.3,35.4};
		
		String[] strArray = new String[3];
		strArray[0] = "고기";strArray[1] = "밥";strArray[2] = "떡";
		
		int[] intArray = new int[3];
		intArray[0] = 10; intArray[1] = 20; intArray[2] = 30;
		
		double[] doubleArray = new double[3];
		doubleArray[0] = 11.5; doubleArray[1] = 22.3;doubleArray[2] = 35.4;
 		
		

	}

}
