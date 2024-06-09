package ifelseconditions;
import java.util.Scanner;

public class Eligibleforvoting {

	public static void main(String[] args) {
		System.out.println("enter the age ");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if (age>=18) {
			System.out.println("eligible for voting");
		}
		else if(age<18) {
			System.out.println("not eligible for voting");
	}
		
		// TODO Auto-generated method stub

	}

}
