
public class Circle extends Shape{

	public double radius;
	
	public Circle(String color,double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public double area() {		
		return radius*radius*3.14;
	}

	@Override
	public String toString() {		
		return "원입니다.";
	}

}
