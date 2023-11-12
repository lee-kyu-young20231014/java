/*
 * Cat과  Person클래스의 객체를 만들고 내부 맴버를 호출한다.
 */
public class Demo1 {

	public static void main(String[] args) {
		Cat c = new Cat();  // 객체를 생성하는 가장 기본적인 방법
		Cat c2 = new Cat();
		
		Person p = new Person();
		Person p2 = new Person();
		
		// 객체. 맴버연산자  객체를 통해 클래스내부의 맴버에 접근
		c.breed = "abc";
		p.name = "홍길동";
	}

}
