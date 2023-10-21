/*
 * 증가 감소 연산자... 변수하나로 연산자와 결합--> 단항연산자
 * ++ : 변수의 값을 하나 증가
 * -- : 변수의 값을 하나 감소
 * 변수++ : 변수의 값을 다음 문장부터 반영한다.(즉시가 아님)
 */
public class Java03 {

	public static void main(String[] args) {
		int count = 0; // 정수형 변수 count를 0으로 초기화해서 만듦
		count++; // 11번 라인에서는 count의 값은 현상태유지고 다음번에 증가
		System.out.println(count++); // 1
		System.out.println(count++); // 2
		System.out.println(count); // 3
		System.out.println("------------------------------");
		count = 0; // count변수 초기화
		++count; // 17번 라인에서는 count의 값은 바로 반영된다. 그래서 1
		System.out.println(++count); // 2
		System.out.println(++count); // 3
		System.out.println(count); // 3
		
//		가장많은 실수 및 헷갈리는 현상 단항연산자를 가지고 변수에 대입
//		int anotherCount = ++count; // anotherCount에 있는 값은?
//		System.out.println(anotherCount); // 4
//		System.out.println(count); // 4
		
		int anotherCount = count++; // anotherCount에 있는 값은?
		System.out.println(anotherCount); // 3
		System.out.println(count); // 4
		
//		++count 의 의미는 다음과 같다.   
//		count = count + 1;
		
		
		
	}

}
