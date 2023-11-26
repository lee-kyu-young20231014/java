import java.util.ArrayList;
import java.util.List;

public class Collection01 {
	public static <T> void myPrint(T a, T b) {
		System.out.println(a);
		System.out.println(b);
	}


	public static void main(String[] args) {
		// 1. 정수형 데이터 5개를 가지는 배열을 정의하고
		// 2. 데이터를 채운다.
		// 3. 그 이상 데이터를 추가하려며?
		//    기존배열의 크기보다 2배큰 배열을 만들고
		//    새로운 배열에 기존배열데이터를 복사한다음 새로만든 배열의 주소를 배열변수에 다시 저장한다.
		int[] ary = new int[5];  // 배열 초기화
		for (int i = 0; i < ary.length; i++) {
			ary[i] = i*5;
		}
//		ary[5] = 100;  // 인덱스 넘어가서 에러 발생
		// 배열 늘리기
		int[] newAray = new int[ary.length*2];
		for (int i = 0; i < ary.length; i++) {
			newAray[i] = ary[i];
		}
		ary = newAray;
		ary[5] = 100;
		
		myPrint(ary,ary);
		
		// 컬랙션은 타입이 정해지지 않은 프레임웍
		List<Integer> listAry = new ArrayList<Integer>();
		listAry.add(10);listAry.add(10);listAry.add(10);
		listAry.add(10);listAry.add(10);listAry.add(10);
		listAry.add(10);listAry.add(10);listAry.add(10);
		System.out.println( listAry.size() );

		
	}

}
