package accessmodifiers;

public class Private_WithinClass {
	private int x=10;
	private void getsum(int num1, int num2) {
		System.out.println("the sum of the two numbers is:"+(num1+num2));
	}
		public static void main(String[] args) {
			Private_WithinClass p1=new Private_WithinClass();
			
			System.out.println("the value of x is:"+p1.x);
			p1.getsum(40,56);
		}

	}


