
public class ColorPoint extends Point{
	public String color;
	
	public ColorPoint() {
//		super(0,0);
	}
	public ColorPoint(int x, int y, String color) {
		super(x,y);  // 생성자 위임
		this.color=color;
	}
}
