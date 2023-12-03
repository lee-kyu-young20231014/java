import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionDemo2 {

	public static void main(String[] args) {		
		Function<Car, String> f1 = t -> t.getModel();
		ToIntFunction<Car> f2 = value -> value.getAge();
		for (Car c : Car.cars) {
			System.out.format("모델: %s  연식 : %d\n", f1.apply(c), f2.applyAsInt(c));
		}	
		// 평균 연식
		double avgYear = average(Car.cars, value -> value.getAge() );
		// 평균 주행거리
		double avgMile = average(Car.cars,  value -> value.getMileage());
		System.out.println("평균연식 : " + avgYear);
		System.out.println("평균주행거리 : " + avgMile);
		
	}
	
	public static double average(List<Car> cars, ToIntFunction<Car> f) {
		double sum = 0.0;
		for (Car car : cars) {
			sum+= f.applyAsInt(car);
		}
		return sum / cars.size();
	}
	

}
