
public class Array04 {

	public static void changeData(int a) {
		a = 10000;
	}
	public static void changeData(int[] a) {
		a[0] = 10000;
	}
	
	// 메소드를 호출할때 데이터를 전달하면 원본 데이터가 변경될까 안될까?
	public static void main(String[] args) {
		// 원본데이터 두개 준비
		int original_int = 0;
		int[] original_array = {100};
		
		// 기본 데이터 전달하기
		changeData(original_int);
		// 참조형 데이터 전달하기
		changeData(original_array);
		
		// 각각의 데이터 타입에 대한 메소드 호출후 결과
		System.out.println("original_int : "+original_int);
		System.out.println("original_array[0] : "+original_array[0]);
		
		
		
	}

}
