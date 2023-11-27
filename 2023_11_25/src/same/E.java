package same;

public class E {
	public static void main(String[] args) {
		// 동일 패키지에서는 private 제외하고는 외부에서 전부 사용 가능
		D d = new D();
		System.out.println(d.a + d.b + d.c);
	}
}
