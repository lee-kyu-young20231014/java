// 클래스 정의
class ClassA{
	public void method01(){
		System.out.println("method01");		
	}
}
interface InterB{
	public void method02();
}
interface InterC{
	public void method03();
}

class Multi extends ClassA implements InterB, InterC {
	@Override
	public void method03() {
		System.out.println("method03");		
	}
	@Override
	public void method02() {
		System.out.println("method02");
	}	
}
public class Poly03 {
	public static void main(String[] args) {
		Multi m = new Multi();
		//  다형성
		ClassA a = new Multi();
		if(a instanceof Multi) {
			Multi temp = (Multi)a;
		}

		InterB b = new Multi();
		InterC c = new Multi();
	}

}
