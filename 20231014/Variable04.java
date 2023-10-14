package java_20231014;

/*
 * overflow : 양수방향으로 데이터가 범위를 넘을때
 * underflow : 음수방향으로 데이터가 범위를 넘을때
 * 
 */
public class Variable04 {

	public static void main(String[] args) {
//		byte -128 ~ 127
		byte temp = 100;
		System.out.println(temp);
		// 오른쪽에서 왼쪽으로 데이터를 할당
		// 오른쪽은 int로 인식하고 왼쪽 byte다...
		// 변수에 값을 할당할때는 작은거에서 큰거로 할당할때는 정상
		// 큰거에서 작은거로 할당할때는 타입을 변경해줘야함
		temp = (byte)128 ;
		System.out.println(temp); // -128
	}

}
