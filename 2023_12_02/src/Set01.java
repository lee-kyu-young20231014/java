import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set01 {

	public static void main(String[] args) {
		Set<Integer> sets = new HashSet<Integer>();
		sets.add(10);sets.add(20);
		System.out.println(sets);
		sets.add(10);
		System.out.println(sets);
		System.out.println(sets.size());
		System.out.println(sets.contains(20));
		
		List<Integer> lists = new ArrayList<Integer>(sets);
		System.out.println(lists);
		sets = new HashSet<Integer>(lists);
		System.out.println(lists);
		// 임의의 10개의 데이터를 리스트에 저장
		for (int i = 0; i < 10; i++) {
			lists.add( (int)(Math.random()*20));
		}
		System.out.println("리스트 : "+ lists);
		sets = new HashSet<Integer>(lists);
		lists = new ArrayList<Integer>(sets);
		System.out.println("리스트 : "+ lists);
	}

}
