
public class Array02_2 {

	public static void main(String[] args) {
		// 자바는 문자열 + 어떤 타입 --- > 자동으로 문자열로 합친다.
		// 문자열 포멧
		int month = 9, price = 58000;
		String str = month + "월 아파트 관리비는 " + price + "입니다.";
		System.out.println(str);
		
		
		str = String.format("%d월 아파트 관리비는 %d입니다. 할인율은 %.2f", month,price,12.587123243432);
		System.out.println(str);
	}

}
