// 팥, 크림
// 클래스에서  this는 자신을 나타내는 객체
public class FishBred {
	String type;   // 팥, 크림
	int price;
	void mix() {System.out.println("반죽하다");}
	void oven() {System.out.println("굽다");}
//shift+alt+s  또는 메뉴중에 source를 눌렀을때 
// Generate getter ans setter를 선택
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}	
}
	

