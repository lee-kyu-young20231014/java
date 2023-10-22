
public class Java09 {
/*
 * 순환문 while
 * 조건식 : 결과가 true / false 를 반환하는 수식
 * while(조건식또는 true,false){
 * 		조건을 만족했을때 실행하는 코드
 * 
 * }  마지막 문장에 도착하면 다시 처음으로 돌아가서 조건식을 평가해서 true면 반복한다  
 */
	public static void main(String[] args) {
		
		int count = 0; // 순환문을 제어하기 위한 변수
		while (count < 5)  // 조건 
		{
			System.out.println("count : " + count + "순환문의 조건 count<5 :" + (count < 5) ); // 순환문에서 표현하고 싶은 로직
			
			count++; // 순환문의 조건을 순환할때마다 변경
		}
		
		// error code --> unreachable code 절대 실행되지 않는 코드
		System.out.println("드디어 while문을 벗어났군요"); 

	}

}
