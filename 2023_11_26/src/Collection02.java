import java.util.ArrayList;
import java.util.List;

public class Collection02 {
 // list 사용하기
	public static void main(String[] args) {
//		ArrayList<Integer> ary = new ArrayList<Integer>(); // 보다는
		List<Integer> nums = new ArrayList<Integer>(); // 다형성을 이용한 객체지향적으로 사용한다.
		// 데이터 입력은 add()
		nums.add(0);nums.add(10);nums.add(20);
		System.out.println(	nums.get(2));
		System.out.println(nums);
		nums.add(123);
		System.out.println(nums);
		nums.add(1, 333);
		System.out.println(nums);
		nums.remove(1);
		System.out.println(nums);
		nums.remove( Integer.valueOf(10)  );
		System.out.println(nums);
		nums.set(0, 200);
		System.out.println(nums);
		System.out.println( nums.contains(20) );
		System.out.println( nums.contains(200000) );
		System.out.println("리스트의 크기는 : "+nums.size());
		// 단순히 리스트와 같은 집합성 데이터를 순환할때는
		// 인덱스 구조가 아니라서 인덱스 넘어가지 않음
		// 매번 인덱스에 해당하는 데이터를 복사해서 가져온다.
		// 객체는 주소기때문에. 복사본도 원본을 수정할수 있어서 괜찮다.
		for (Integer data : nums) {
			System.out.println(data);
		}
	}

}
