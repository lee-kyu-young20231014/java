
public class Demo03 {

	public static void main(String[] args) {
		// animal,cat,dog 클래스 객체만들어 서 각각 sound() 메소드 호출
//		Animal a = new Animal(); 	a.sound();
//		Cat c = new Cat(); 			c.sound();
//		Dog d = new Dog(); 			d.sound();
		
		Animal[] array = { new Dog(), new Dog(), new Cat(), new Animal()  };
		for (int i = 0; i < array.length; i++) {
			array[i].sound();
		}
		
		Animal a = new Dog();
		if (a instanceof Dog) {
			Dog d = (Dog)a;			
		}
		
		Object o = new Dog();
		Dog d2 = (Dog)o;
		
		
		
		
		
		

	}

}
