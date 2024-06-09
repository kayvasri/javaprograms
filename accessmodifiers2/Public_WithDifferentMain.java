package accessmodifiers2;

import accessmodifiers.Public_SamePackageDifferentClass;
public class Public_WithDifferentMain {

	public static void main(String[] args) {
		Public_SamePackageDifferentClass p2=new Public_SamePackageDifferentClass();
	System.out.println(p2.x);
	p2.display();	
		
		
	}
		
}
