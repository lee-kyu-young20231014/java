import java.util.ArrayList;
import java.util.List;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class OperatorDemo1 {

	public static void main(String[] args) {
		IntUnaryOperator add = operand -> operand+2;
		System.out.println(add.applyAsInt(3));
		
		UnaryOperator<Integer> add2again = t -> t = t+2;
		System.out.println(add2again.apply(10));
		
		IntUnaryOperator mul2 = operand ->operand*2;
		
		IntUnaryOperator add2mul2 = add.andThen(mul2);
		System.out.println(add2mul2.applyAsInt(3));
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(5); list.add(6); list.add(7);
		list.replaceAll(t ->t+10 );
		System.out.println(list);

	}

}
