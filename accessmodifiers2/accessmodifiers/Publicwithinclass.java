package accessmodifiers;

public class Publicwithinclass {
	//declare a variaable
		public int a=10;//create an object 
		public void getSum(int num1,int num2) {
		System.out.println("addition of numbers is "+(num1+num2));
				}

		//private
		private int num=20;
		private void getMultiply(int num1,int num2){
		System.out.println("the multplication number is :"+(num1*num2));
		}

		public static void main(String[] args) {
		Publicwithinclass obj=new Publicwithinclass();
		//public
		System.out.println("the value is " +obj.a);
		obj.getSum(10,50);

		//private
		System.out.println("the value for private variable " +obj.num);
		obj.getMultiply(20,40);
			}

}
