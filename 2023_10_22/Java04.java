
public class Java04 {

	public static void main(String[] args) {
//		if ~else 의 사용 이유
		String rank = "";
		int score = 75;		
		if(score >=90) {
			rank = "A";
		}		
		if(score >= 80 && score<=89) {  // 80 81 82 ~ 89
			rank = "B";
		}		
		if(score >= 70 && score<=79) {  // 80 81 82 ~ 89
			rank = "C";
		}		
		System.out.println("학점은 : "+rank+" 입니다.");

	}

}
