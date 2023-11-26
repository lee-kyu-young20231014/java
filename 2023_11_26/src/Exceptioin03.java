// 사용자 정의 예외
class UnderZeroException extends Exception{
	private static final long serialVersionUID = 1L;
	public UnderZeroException() {
		super();		
	}
	public UnderZeroException(String message) {
		super(message);		
	}	
}

public class Exceptioin03 {
	public static void check(int num) throws UnderZeroException {
		if(num < 0) 
			throw new UnderZeroException("0보다 작다");		
	}
	
	public static void main(String[] args) {	
		try {
			check(-5);
		} catch (UnderZeroException e) {
			// 사용자가 생성한 예외타입이 발생했을때
			e.printStackTrace();
		} catch (Exception e) {
			// 위에 있는 catch를 제외한 모든 예외
			e.printStackTrace();
		}		
		
	}
}