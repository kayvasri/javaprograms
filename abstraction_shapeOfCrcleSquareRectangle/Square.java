package abstraction_shapeOfCrcleSquareRectangle;

public class Square extends Shape {
	private float side;
	public Square() {}
	public Square(float side) {
		this.side = side;
	}
	public float getSide() {
		return side;
	}
	public void setSide(float side) {
		this.side = side;
	}
	public void area() {
		System.out.println("Area of Square "+(side*side));
	}
	public double perimeter() {
		return 4*side;
	}
}
