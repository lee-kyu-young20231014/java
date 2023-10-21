import java.util.Scanner;

public class Review02 {

	public static void main(String[] args) {
//		사용자로부터 연도를 입력받아서 해당 년도가 윤년인지 아닌지 판단
		Scanner sc = new Scanner(System.in);
		System.out.print("년도를 입력하세요(4자리정수) : ");
		int year = sc.nextInt();
		boolean check= (year % 4 == 0) || ( !(year % 100 ==0 || year%400 !=0) );
		System.out.println("입력하신 해당 년도의 윤년여부는 다음과 같습니다.");
		System.out.println( (check)? "윤년입니다.":"평년입니다."  );	

	}

}
