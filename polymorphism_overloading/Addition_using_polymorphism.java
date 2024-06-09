package polymorphism_overloading;

public class Addition_using_polymorphism {
	public int add(int a,int b) {
		return a+b;
	}
	public void add(int a,float b,double c) {
		System.out.println(a+b+c);
		
	}
	public void add(float a,float b) {
		System.out.println( a+b);
		
	}

}
