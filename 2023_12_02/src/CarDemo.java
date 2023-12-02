import java.util.ArrayList;
import java.util.List;

public class CarDemo {

	public static void main(String[] args) {
	}
	public static List<Car> findCars(List<Car> all, CarPredicate cp){
		List<Car> result = new ArrayList<Car>();
		for (Car car : all) {
			if(cp.test(car))
				result.add(car);
		}
		return result;
	}

}
