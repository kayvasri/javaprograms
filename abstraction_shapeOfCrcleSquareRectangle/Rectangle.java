package abstraction_shapeOfCrcleSquareRectangle;

public class Rectangle extends Shape{
	float length;
	float breadth;
	
 public Rectangle() {}
 public Rectangle(float length,float breadth) {
	 this.length=length;
	 this.breadth=breadth;
 }
 public float getLength() {
	 return length;
 }
public float getBreadth() {
	return breadth;
}
 
 public void setLengthBreadth(float length,float breadth) {
	 this.length=length;
	 this.breadth=breadth;
	 
 }
 public void area() {
	 System.out.println("Area of REctangle is "+(2*(length+breadth)));
 }
public double perimeter() {
	return (length*breadth);
}
public void rectangleHeight(float width,float perimeter) {
	System.out.println("rectangle height is "+(perimeter/2*-width));
}
}
