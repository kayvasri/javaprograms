package ifelseconditions;
import java.util.Scanner;
public class Greatestofthreenumbers {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter three numbers :");
		 int num1=sc.nextInt();
		 int num2=sc.nextInt();
		 int num3=sc.nextInt();
		if (num1>num2&&num1>num3) {
			System.out.println("the greatest number of "+num1+","+num2+","+num3+" is "+num1);
		}else if(num2>num1&&num2>num3) {
			System.out.println("the greatest number of "+num1+","+num2+","+num3+" is "+num2);
		}else if(num3>num1&&num3>num2) {
			System.out.println("the greatest number of "+num1+","+num2+","+num3+" is "+num3);
		}else {
			System.out.println("the number entered is invalid");
		}
		}
		}
			

		 
	



