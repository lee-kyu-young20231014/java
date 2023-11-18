
public class Chain {

	Chain() {
		this(10);
		System.out.println("기본생성자 Chain()");
	}
	Chain(int x) {
		this(x, 20);
		System.out.println("생성자 Chain(int x)");
		System.out.println(x);
	}
	
	Chain(int x, int y) {
		System.out.println("생성자 Chain(int x, int y)");
		System.out.println(x + " " + y);
	}
}
