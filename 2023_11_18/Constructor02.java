
public class Constructor02 {

	public static void main(String[] args) {
//		생성자 overloading
//		overloading --> 과적.. 구분할수 있다. 메소드이름이 같아도 매개변수가 다르면 구분가능 
		
		Add a1 = new Add();
		Add a2 = new Add(5.2, 1.3);
		Add a3 = new Add(1.2, 13);
		Add a4 = new Add(10, 20);

	}

}
