
public class Demo2 {

	public static void main(String[] args) {
		Shape s1 =  new Circle("red", 5);
		Shape s2 = new Rectangle("blue", 5, 5);
		System.out.println(s1.area());
		System.out.println(s2.area());
		System.out.println(s1);
		System.out.println(s2);
	}
}