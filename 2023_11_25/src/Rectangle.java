
public class Rectangle extends Shape {
	public double with, height;

	public Rectangle(String color,double with,double height) {
		super(color);
		this.with = with;
		this.height=height;
	}
	
	@Override
	public double area() {		
		return with*height;
	}

	@Override
	public String toString() {		
		return "사각형 입니다.";
	}

}
