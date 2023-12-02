import java.util.Arrays;

public class Lambda01 {

	public static void main(String[] args) {
		String[] str = {
			"로마에 가면 로마법을 따라라",
			"시간은 금이다",
			"펜은 칼보다 강하다"
		};
		Arrays.sort(str);
		System.out.println(Arrays.toString(str));		
		Arrays.sort(str, (String o1, String o2) ->{return o1.length() - o2.length();} );
		System.out.println(Arrays.toString(str));

	}

}
