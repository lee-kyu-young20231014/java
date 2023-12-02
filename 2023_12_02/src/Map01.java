import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Map01 {

	public static void main(String[] args) {
		// 생성
		Map<String, Integer> maps = new HashMap<String, Integer>();
		maps.put("국어", 98);maps.put("영어", 100);maps.put("수학", 99);maps.put("국사", 99);
		System.out.println(maps);
		
		System.out.println("국어점수는 : "+ maps.get("국어") );
		maps.put("국어", 100); // 기존 국어의 값을 변경
		System.out.println("국어점수는 : "+ maps.get("국어") );
		for (String key : maps.keySet()) {  // 키값만 set형태로 반환
			System.out.println("키값 : " + key);
		} 
		for (Integer value : maps.values()) { // 값만 collection 타입으로 반환
			System.out.println("값 : " + value);
		}
		for (Entry<String, Integer> entry : maps.entrySet()) {  // key , value를 동시에 반환
			System.out.format("키값 : %s  값 : %d\n",entry.getKey(), entry.getValue());
		}
		// sort이용한  정렬은  리스트만 가능
		System.out.println("map을 키를 기준으로 오름차순으로 정렬");
		List<String> temp = new ArrayList<String>( maps.keySet() );
		temp.sort(null); // 오름차순
		for (String key : temp) {
			System.out.format("키:%s  값:%d\n",key,maps.get(key));
		}
		temp.sort(Collections.reverseOrder()); // 내림차순
		for (String key : temp) {
			System.out.format("키:%s  값:%d\n",key,maps.get(key));
		}
		
		

	}

}
