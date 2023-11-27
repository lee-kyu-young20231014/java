import java.util.Scanner;

class Person{
	public int price = 15000;
	public int getPrice() {return price;}
}
// 다형성.... 부모타입으로 자식객체를 저장(표현,관리)하는것
// shift+alt+s
class Adult extends Person{
	@Override
	public int getPrice() {		
		return price;
	}	
}
class TeanAger extends Person{

	@Override
	public int getPrice() {		
		return (int) (price * 0.7);
	}
	
}

public class Test01 {
	/*
	 * 사용자로부터 나이를 입력받아서 
	 * 성인과(21~), 청소년
	 * 입장수입 계산
	 * 	성인 : 15000, 청소년 30%할인
	 * 5명 입장 
	 */	
	public static void main(String[] args) {
		// 입장객 저장할 배열
		// 배열은 타입이 같다.
		Person[] enters = new Person[5];		
				
		Scanner sc = new Scanner(System.in);
		/// 순환문으로 5명 입력 받기.... start
		for (int i = 0; i < 5; i++) {
			System.out.print("나이를 입력하세요 : ");
			int age = sc.nextInt();
			if(age>=21) {
				// 배열에 저장
				enters[i] = new Adult();
			}else {
				// 배열에 저장
				enters[i] = new TeanAger();
			}			
		} // end for
		int totalPrice = 0;
		for (int i = 0; i < enters.length; i++) {
			totalPrice += enters[i].getPrice();
		}
		System.out.println("총 입장 금액은 : "+ totalPrice);
		
	}

}
