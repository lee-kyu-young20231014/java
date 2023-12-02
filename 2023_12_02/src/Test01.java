import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test01 {

	public static void main(String[] args) {
		// 0 ~ 19 임의의 정수를 생성		
		// 10개의 중복없이 랜덤한 정수를 추출
		// hint  size()를 이용
		
		Set<Integer> lotto = new HashSet<Integer>();		
		while(lotto.size() < 10) {
			int num = (int)(Math.random()*20);
			lotto.add(num);
		}
		List<Integer> lists = new ArrayList<Integer>(lotto);
		lists.sort(null);
		System.out.println(lists);		
	}

}
