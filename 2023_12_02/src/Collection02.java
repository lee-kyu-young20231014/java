import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collection02 {
	// Arrays.asList(배열) --> 크기가 고정된 리스트(add 불가.. set(인덱스,값)->해당 인덱스에 값만 변경
	// 배열을 프린트문으로 출력 Arrays.toString(배열)
	public static void main(String[] args) {
		// 배열을 리스트로 변환
		String[] animals = {"사슴","호랑이","바다표범","곰"};
		List<String> animal_list = Arrays.asList(animals);
//		animal_list.add("앵무새"); // asList는 고정된 사이즈를 반환 추가 메소드가 없다
		animal_list.set(1,"앵무새");
		System.out.println(animal_list);
		animal_list.sort(null);
		System.out.println(animal_list);		
		// 리스트를 배열로 변환
		for (int i = 0; i < animals.length; i++) {
			animals[i] = animal_list.get(i);
		}
		System.out.println( Arrays.toString(animals) );
	}

}
