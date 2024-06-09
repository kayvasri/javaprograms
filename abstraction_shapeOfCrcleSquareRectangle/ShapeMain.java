package abstraction_shapeOfCrcleSquareRectangle;

public class ShapeMain {

	public static void main(String[] args) {
		Square s=new Square(10);
//		s.setSide(20);
		s.area();
		System.out.println("perimeter of square is "+s.perimeter());
		Circle c=new Circle();
		c.setRadius(2);
		
		c.area();
		System.out.println("Perimeter of circle is "+c.perimeter());
		Rectangle r=new Rectangle ();
		r.setLengthBreadth(10,20);
		r.area();
		System.out.println("perimeter of rectangle is "+r.perimeter());
		r.rectangleHeight(12, 067);
	}

}
