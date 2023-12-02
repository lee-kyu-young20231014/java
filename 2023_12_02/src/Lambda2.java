// 사용자 정의 
interface Negative{
	int neg(int x);
}
interface printable{
	void print();
}


public class Lambda2 {

	public static void main(String[] args) {
		Negative n;
		n =  (int x)->{return x*100; };		
		n =  (x)->{return x*100; };
		n =  x->{return x*100; }; // 매개변수가 여러개 일때는 안됨
		n =  (int x)-> x*100;
		n =  (x)-> x*100;		
		n =  x-> x*100;
		
		System.out.println(n.neg(10));
		
		printable p;
		p = () -> {System.out.println("안녕");};
		p = () -> System.out.println("안녕");
		
		p.print();

	}

}
