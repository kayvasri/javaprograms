package abstraction_shapeOfCrcleSquareRectangle;

 public class Circle extends Shape {
	float radius;
	public Circle(){}
	Circle(float radius){
		this.radius=radius;
		
	}
	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius=radius;
	}
	public void area() {
		System.out.println("Area of square is "+(3.14*radius*radius));
		
	}
	public double perimeter() {
		return (2*3.14*radius);
	}

}
