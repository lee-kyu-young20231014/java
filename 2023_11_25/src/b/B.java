package b;

import a.A;

public class B {

	public static void main(String[] args) {
		// 다른 패키지에 있는 클래스의 객체를 생성
		A a = new A();
		System.out.println(a.a);
		
		// 상속을 받은 Inharitance 의 객체?
		Inharitance ih = new Inharitance();
		System.out.println(ih.a);

	}

}
