package mypackage;

import otherpackage.B;

public class Main01 {

	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.v_public);
		
		A a = new A();
		// 아래 다 가능
		System.out.println(a.v_default);
		System.out.println(a.v_protected);
		System.out.println(a.v_public);

	}

}
