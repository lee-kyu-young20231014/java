// 커플링된 관계(인터페이스를 사용 안하는 예시) 
interface showInfoInterface{
	public void showinfo();
}
//class A implements showInfoInterface{
//	public void showinfo() {
//		System.out.println("showinfo() 호출");
//	}
//}
class B implements showInfoInterface{
	public void showinfo() {
		System.out.println("showinfo() 호출");
	}
}

public class Poly02 {
	// 서비를 제공하는 로직(중요 비지니스 로직) - 디 커플링, 느슨한 관계로 설계
	public static void myMethod(showInfoInterface a) 
	{
		a.showinfo();
	}
	
	public static void main(String[] args) {
		myMethod(new B()); // 서비를 사용하는 로직

	}

}
