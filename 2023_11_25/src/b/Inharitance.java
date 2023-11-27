package b;

import a.A;

public class Inharitance extends A{
	public void method() {
		// 패키지가 다르면 상속을 받았을때 public 과 protected만 가능
		System.out.println(this.a + this.c);
	}

}
