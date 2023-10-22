/*
 * if(조건식)
 * 	문장1
 * 	문장2
 * 조건문에 포함되는 문장은 : 문장1이고
 * 문장2는 조거문과 상관없는 문장이다.
 * 그래서 두개의 문장을 조건문에 포함시키려면 { } 감싼다
 */
public class Java02 {

	public static void main(String[] args) {
		if(false)  
			System.out.println("문장1");
			System.out.println("문장2");
		
		System.out.println("문장3");
	}

}
