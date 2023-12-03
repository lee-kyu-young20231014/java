import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

@FunctionalInterface
interface func1{
	int add(int x, int y);
}


public class Demo01 {
	

	public static void main(String[] args) {
		//1. 간단한 람다함수  두개의 정수를 더하는 함수를 람다로 표현
		func1 result = (int x, int y) -> x+y;
		System.out.println( result.add(10,20));
		
		//맵을 이용해서 리스트를 변환
		List<String> fruts =  Arrays.asList("apple","banana","orange","pineapple");
		List<Integer> frutsLengths = mapping(fruts, String::length);
		System.out.println(frutsLengths);
		
		System.out.println(filterLists(fruts, t -> t.contains("p") ));		
		
	}
	public static <T, R> List<R> mapping(List<T> list, Function<T, R> mapper) {
		List<R> result = new ArrayList<R>();
		for (T item : list) {
			result.add(mapper.apply(item));
		}
		return result;
	}
	
	// 필터기능 predicate ->검사
	public static <T> List<T> filterLists(List<T> list, Predicate<T> filter){
		List<T> result = new ArrayList<T>();
		for (T t : list) {
			if(filter.test(t))
				result.add(t);
		}
		return result;
		
	}

}
