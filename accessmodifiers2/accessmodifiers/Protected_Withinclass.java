package accessmodifiers;

public class Protected_Withinclass {
	protected int a=10;
	protected void display() {
		System.out.println("protected is accessible within a class");
	}
	public static void main(String[] args) {
		Protected_Withinclass pro=new Protected_Withinclass();
		System.out.println("protected variable " + pro.a);
		pro.display();
}


}
