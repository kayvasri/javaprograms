package methodOverriding;

public class MethodOverridingMain {

	public static void main(String[] args) {
		Superclass s=new Superclass();
		s.superclass();
		Superclass s1=new Subclass();
		s1.superclass();
		Subclass s2=new Subclass();
		s2.superclass();



	}

}
