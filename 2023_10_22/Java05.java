
public class Java05 {

	public static void main(String[] args) {
//		중접 if
		int age = 10;
		if(age > 19) {
			if(age > 75) {
				// age 20 ~ 74
				System.out.println("1번으로 가세요");
			}else {
				// 75 ~
				System.out.println("2번으로 가세요");
			}
		}
		else {
			// 19 18 17 ~
			System.out.println("3번으로 가세요");
		}
		
//		--------------------------------------------
		if(age > 19) {
			if(age > 75) {
				// age 20 ~ 74
				System.out.println("1번으로 가세요");
			}
		}
		//위의 코드와 동일하게 작동하려면 조건문의 조건식을 ...... 
		if( age >19 && age < 75  ) {
			System.out.println("1번으로 가세요");
		}else {
			// age 19 18 17 ~   , 75 76 77 78
		}
	}

}
