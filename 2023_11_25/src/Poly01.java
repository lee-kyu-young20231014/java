// 커플링된 관계(인터페이스를 사용 안하는 예시) 
class AA{
	public void showinfo() {
		System.out.println("showinfo() 호출");
	}
}

public class Poly01 {
	// 서비를 제공하는 로직(중요 비지니스 로직)
	public static void myMethod(AA a) 
	{
		a.showinfo();
	}
	
	public static void main(String[] args) {
		myMethod(new AA()); // 서비를 사용하는 로직

	}

}
