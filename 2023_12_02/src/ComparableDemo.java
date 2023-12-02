import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class SortType implements Comparator<Rectangle>{

	@Override
	public int compare(Rectangle o1, Rectangle o2) {		
		return o2.getArea() - o1.getArea();
	}	
}

class SortType2 implements Comparator<Rectangle>{

	@Override
	public int compare(Rectangle o1, Rectangle o2) {		
		return o1.getWidth() - o2.getWidth();
	}	
}

public class ComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Rectangle> lists = new ArrayList<Rectangle>();
		lists.add(new Rectangle(10, 10));
		lists.add(new Rectangle(20, 5));
		lists.add(new Rectangle(30, 15));
		lists.add(new Rectangle(40, 22));
		lists.sort(null);// 오름차순 : 면적
		System.out.println(lists); 
		// 내림차순 :면적		
		lists.sort(new SortType());
		System.out.println(lists);

		// 오름차순 : 가로길이만
		lists.sort(new SortType2());
		System.out.println(lists);
		
		// 오름차순 : 세로길이
		lists.sort((Rectangle o1, Rectangle o2) -> { return o1.getHeight() - o2.getHeight();} );
		System.out.println(lists);
		
	}

}
