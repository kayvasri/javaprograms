package accessmodifiers;

public class Protected_Withsameclass {
	protected int x=5;
	 protected void getsum(int num1 , int num2) {
		 System.out.println("the addition of two values is :"+(num1+num2));
	 }
		public static void main(String[] args) {
			Protected_Withsameclass p1=new Protected_Withsameclass ();
			System.out.println("the value of:"+p1.x);
			p1.getsum(23,45);
		}

}
