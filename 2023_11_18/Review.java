	/*
	 * 클래스
	 * 	맴버
	 * 		변수
	 * 			static변수
	 * 			non-static변수
	 * 		메소드
	 * 			지역변수
	 */
public class Review {

	int nonStaticVal = 0;   // non-static 변수  객체단위로 사용
	static int staticVal = 0; // static변수 클래스단위 사용  객체보다 먼저 생성된다
	
	public static void main(String[] args) {
		// Review 클래스 객체 생성
		Review r = new Review();
		Review r2 = new Review();
		// 객체 r과 r2는 서로 다른 객체
		System.out.println("객체를 생성한수 각각의 변수.....");
		System.out.format("r객체의 변수 nonStatic %d  static %d\n",r.nonStaticVal,r.staticVal);
		System.out.format("r2객체의 변수 nonStatic %d  static %d\n",r2.nonStaticVal,r2.staticVal);
		System.out.println("r객체를 이용해서 nonStatic 변수를 20으로 셋팅하고 static 변수도 10으로 셋팅");
		
		r.nonStaticVal = 20;
		System.out.format("r객체의 변수 nonStatic %d  static %d\n",r.nonStaticVal,r.staticVal);
		System.out.format("r2객체의 변수 nonStatic %d  static %d\n",r2.nonStaticVal,r2.staticVal);
		
		r.staticVal = 10;
		System.out.format("r객체의 변수 nonStatic %d  static %d\n",r.nonStaticVal,r.staticVal);
		System.out.format("r2객체의 변수 nonStatic %d  static %d\n",r2.nonStaticVal,r2.staticVal);
		
	}

}
