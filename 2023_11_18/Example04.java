
public class Example04 {

	public static void main(String[] args) {
		// cat 객체 3개를 만든다
		Cat cat1 = new Cat();	
		cat1.breed = "페르시안";
		cat1.eat();
		
		Cat cat2 = new Cat();
		cat2.breed = "샴";
		
		Cat cat3 = new Cat("러시안 블루");
		
		System.out.println(cat1.breed);
		System.out.println(cat2.breed);
		System.out.println(cat3.breed);
	}

}
