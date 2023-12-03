import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicatedDemo {

	public static void main(String[] args) {
		IntPredicate even = value -> value%2 == 0;
		System.out.println(even.test(15)? "짝수" : "홀수");

		IntPredicate one = value -> value == 1;
		IntPredicate oneOrEven = one.or(even);
		System.out.println(oneOrEven.test(10)? "1 또는 짝수" : "1이 아닌 홀수");
		
		Predicate<String> p = t -> t.equals("홍길동");
		System.out.println(p.test("홍길동"));
		
		BiPredicate<Integer, Integer> bp = (t, u) -> t > u;
		System.out.println(bp.test(10, 5));
		
	}

}
