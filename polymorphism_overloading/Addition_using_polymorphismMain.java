package polymorphism_overloading;

public class Addition_using_polymorphismMain {

	public static void main(String[] args) {
		Addition_using_polymorphism add=new Addition_using_polymorphism();
		
		System.out.println(add.add(2, 3));
		add.add(2, 3, 6);
		add.add(2.0f, 3.0f);


	}

}
