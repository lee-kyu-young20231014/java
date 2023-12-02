// 비교 가능한 Comparable 속성의 클래스로 만들어 줘야 정렬이 가능하다
public class Rectangle implements Comparable<Rectangle>{
	private int width,height;

	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int getArea() {
		return width*height;
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	// -1이 되는방향으로 정렬
	@Override
	public int compareTo(Rectangle o) {		
		return this.getArea() - o.getArea(); // 오름차순
//		return o.getArea() - this.getArea(); // 내림차순
	}
	
}
