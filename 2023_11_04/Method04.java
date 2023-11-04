import java.util.Date;

public class Method04 {
	// 현재시간을 출력하는 메소드
	public static void displayCurrentTime() {
		Date currentTime = new Date();
		System.out.println("현재시간 : "+ currentTime);
	}
	
	
	public static void main(String[] args) {
		displayCurrentTime();
	}

}
