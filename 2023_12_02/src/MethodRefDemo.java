interface Mathmatical{
	double calculate(double d);
}
interface Pickable{
	char pic(String s, int i);
}
interface Computable{
	int compute(int x, int y);
}
class Utils{
	int add(int a, int b) {
		return a+b;
	}
}

public class MethodRefDemo {
	public static double myF(double d) {
		return Math.abs(d);
	}
	
	public static void main(String[] args) {
		Mathmatical m;
		Pickable p;
		Computable c;
		m = (d)-> Math.abs(d); // 구현부에서 직접구현하지 않고 다른 메소드를 사용
		m = Math::abs;  // 메소드 자체		
		System.out.println(m.calculate(-50));
		
		p = (s,i) -> s.charAt(i);
		p = String::charAt;
		System.out.println( p.pic("안녕 나야 반가워", 6) );	
		
		Utils u = new Utils();
		System.out.println( u.add(10, 20) );
		
		c = (x, y) -> x*2+y*3; 
		c = (x,y)->u.add(x, y);
		c = u::add;
		System.out.println(c.compute(10, 20));
	}

}









