
public class Method03 {

	public static int max(int x, int y) {
		return (x > y)? x : y;		
	}
	
	
	public static void main(String[] args) {
		int a = 5, b = 6;
		int num = max(a,b);
		System.out.println(num);
	}

}
