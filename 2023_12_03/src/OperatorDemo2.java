import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class OperatorDemo2 {

	public static void main(String[] args) {
		Comparator<Integer> comparator = (o1, o2) -> o1-o2; // 오름차순
		BinaryOperator<Integer> op1 = BinaryOperator.maxBy(comparator);
		System.out.println(op1.apply(5, 10));
		List<Car> newCars 
		=  remodeling(Car.cars, t -> new Car("new_"+t.getModel(), t.isGasoline(), t.getAge(), t.getMileage()) );
		System.out.println(newCars);
		
				
		
		
		
	}
	
	public static List<Car> remodeling(List<Car> cars, UnaryOperator<Car> o){
		List<Car> result = new ArrayList<Car>();
		for (Car car : cars) {
			result.add(o.apply(car));
		}
		return result;
	}

}
