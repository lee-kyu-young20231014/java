
public class Inharitance01 extends Calculation  {
	public void multiplication(int x, int y) {
		z = x * y;
		System.out.println("두수의 곱셈 : " + z);
	}
	

	public static void main(String[] args) {
		
		Inharitance01 obj = new Inharitance01();
		obj.addition(1, 2);   // 부모
		obj.subtraction(2, 1); // 부모
		obj.multiplication(1, 5); // 자신이 만든것
	}

}
