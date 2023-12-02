import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Collection01 {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<Integer>();
		
		//Math.random()  0 < x < 1
		for (int i = 0; i < 10; i++) {
			nums.add( (int)(Math.random()*100) );			
		}
		System.out.println(nums);
		// 정렬
		nums.sort(null); // 오름차순
		System.out.println(nums);
		nums.sort(Comparator.reverseOrder());
		System.out.println(nums); // 내림차순
		
	}

}
