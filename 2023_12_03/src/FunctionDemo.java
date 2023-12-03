import java.util.function.Function;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToDoubleBiFunction;

public class FunctionDemo {

	public static void main(String[] args) {
		Function<Integer, Integer> add  = t -> t*t;
		Function<Integer, Integer> divide = t -> (int)(t/2); 
		Function<String, Integer> strToint = t -> Integer.valueOf(t);
		System.out.println( add.apply(5));
		System.out.println( strToint.apply("123") + 10 );
		System.out.println(add.andThen(divide).apply(5));
		
		IntToDoubleFunction half = value -> value/2.0;
		System.out.println(half.applyAsDouble(5));
		
		ToDoubleBiFunction<String, Integer> circleArea = (t, u) -> Double.valueOf(t)*u*u;
		double area = circleArea.applyAsDouble("3.14",5);
		System.out.println(area);
	}

}
