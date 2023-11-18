
public class Add {
	// 다양한 생성자를 만들어서 
	// 객체생성시 전달받은 데이터들을 + 연산해서 출력한다
	// 기본생성자
	Add(){ System.out.println("기본생성자 호출");}
	// 정수형 데이터 2개 전달받아서 합을구한다음 출력하는 생성자
	Add(int x, int y){
		System.out.println(x+y);
	}
	// 실수형 데이터(double) 2개 전달받아서 합을구한다음 출력하는 생성자
	Add(double x, double y){
		System.out.println(x+y);
	}
	// 실수형 데이터(double) 1개 정수형(int) 데이터 1개 전달받아서 합을구한다음 출력하는 생성자
	Add(double x, int y){
		System.out.println(x+y);
	}
	
	
}
