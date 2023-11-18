
public class Cat {
	// 인스턴스 변수
	String breed;
	String color;
	// 기본생성자를 만들어서 확인, 기본생성자는 매개변수가 없어요
	Cat(){
		System.out.println("기본생성자 호출");
	}
	Cat(String pBreed){
		System.out.println("일반생성자 호출");
		breed = pBreed;
	}
	
	void eat() {
		System.out.println("eat");
	}
	void scratch() {
		System.out.println("scratch");
	}
	void meow() {
		System.out.println("meow");
	}	
	
}
