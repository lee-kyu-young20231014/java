
public abstract class Shape {
	public String color;
	
// 생성자...
	public Shape(String color) {
		super(); // 부모 기본 생성자
		this.color = color;
	}
	public abstract double area();
	public abstract String toString();	
}
