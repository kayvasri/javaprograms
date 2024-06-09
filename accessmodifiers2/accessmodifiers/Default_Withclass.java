package accessmodifiers;

public class Default_Withclass {
	int x=10;
	public void getbool(int num1,int num2) {
		if(num1>num2)
			System.out.println("true");
		else
			System.out.println("false");
	}
	public static void main(String[] args) {
		
Default_Withclass p1=new Default_Withclass();
		System.out.println("the value of x is:"+p1.x);
		p1.getbool(45,56);
	}

}
