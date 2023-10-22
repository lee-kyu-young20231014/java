
public class Java11 {

	public static void main(String[] args) {
//		System.out.println("안녕하세요 반갑습니다.");
//		System.out.println("안녕하세요 반갑습니다.");
//		System.out.println("안녕하세요 반갑습니다.");
//		System.out.println("안녕하세요 반갑습니다.");
//		System.out.println("안녕하세요 반갑습니다.");
//		1. 위와 동일한 결과가 나오도록 순환문 while을 이용해서 표현
		
//		int count = 0;
//		while (count < 5) {
//			System.out.println("안녕하세요 반갑습니다.");
//			count++;
//		}
		
//		2. 0 ~ 10 까지의 숫자중에서 짝수만 출력 while문과 if문을 적절히 사용
//		0 1 2 3 ~ 10
//		int count = 0;
//		while (count <=10) {
//			if(count % 2 == 0) {
//				System.out.println(count);	
//			}			
//			count++;
//		}
		
//		순환문을 통과할때 마다 0 2 4 6 8 10이 되도록 변수를 2씩 증가시키다.  val += 2
//		int count = 0;
//		int data = 0;
//		while (count<6) {
//			System.out.println(data);
//			data += 2;
//			
//			count++;
//		}
		
		int count = 0;		
		while (count<=10) {
			System.out.println(count);
			count += 2;
		}		

	}

}
