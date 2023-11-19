// 클래스 만드는 규칙(standard 한 것... 항상 그런건 안임)
// 1. 변수는 private으로 선언해서 캡슐화 한다
// 2. 변수가 있으면 해당 변수를 초기화하는 생성자를 만든다 - 기본생성자도 같이 만들어준다.
//      WHY????? 사용자가 생성자를 만들면 컴파일러는 더 이상 자동으로 기본생성자를 제공 안해준다..
// 3. 일반 생성자를 만들면 기본생성자도 만든다
// 4. 변수가 private 이기때문에 해당변수에 값을 읽고쓸수있는 getter/setter를 제공한다.
//        getter ---> get변수명    setter --> set변수명
//       shift+alt+s 를 눌러서 generate getter/setter 메뉴를 선택해서 자동으로 만든다      

// 변수는 이름,전화번호,주소
public class Person {
	private String name;
	private String address;
	private String phone;
	public Person() {}
	public Person(String name, String address, String phone) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
