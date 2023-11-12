
public class Demo2 {

	public static void main(String[] args) {
		// Cat 객체 한개 Person 객체 한개 만들고 변수에 적절한 값을 넣고
		// 변수출력해 보고
		// 각각의 메소드도 호출해 봅시다
		Cat c1 = new Cat();			 // 객체생성
		Person p = new Person();	// 객체생성
		c1.breed="페르시안 고양이";		// 객체 인스턴 변수 값 대입
		c1.color = "검정색";			// 객체 인스턴수 변수 값 대입
		
		p.name = "홍길동";			// 객체 인스턴스 변수 값 대입
		p.reg_num = 2;				// 객체 인스턴스 변수 값 대입
		System.out.println(c1.breed + " " + c1.color);
		System.out.println(p.name + " " + p.reg_num);
		
		c1.eat();					// 객체 인스턴스 매소드 호출
		c1.meow();
		
		p.run();
		p.walk();

	}

}
