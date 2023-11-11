
public class Example01 {

	public static void main(String[] args) {
		// 문자열에서 실수하기 쉬운 케이스
		// 값을 비교
		int a = 10, b=10;
		System.out.println(a == b); // True  두 변수의 값을 비교
		
		
		// 기본타입을제외한 배열포함 다른 타입(String)의 변수는 주소를 가지고 있다 ==> 참조형 변수
		// 그래서 변수를 직접 비교하면 값을 비교하는게 아니라..변수들이 가지는 주소값을 비교
		int[] x1 = {1,2,3}, x2= {1,2,3};
		System.out.println(x1 == x2);  // 주소값을 비교
		
		String s1 = new String("java"); // 새롭게 메모리를 할당받는다
		String s2 = new String("java"); // 새롭게 메모리를 할당받는다
		System.out.println(s1 == s2);  // 값을 비교하는게 아니라 두 변수의 주소값을 비교
		System.out.println(s1.equals(s2)); // 값을 비교
		
		String s3 = "java"; // 상수이기때문에 같은 주소를 할당해준다. 
		String s4 = "java"; // 상수이기때문에 같은 주소를 할당해준다.
		System.out.println(s3 == s4);  // 주소를 비교한다. 상수를 할당받았기 때문에 같은 주소
		
		// 결론 : 문자열의 비교는 equals 를 사용해서 항상 값으로 비교한다. 절대 주소값을 비교하지 말것
		
	}

}
