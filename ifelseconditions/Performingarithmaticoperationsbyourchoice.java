package ifelseconditions;
import java.util.*;
public class Performingarithmaticoperationsbyourchoice {

	public static void main(String[] args) {
		
		System.out.println("enter your choice : ");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		
				if (choice==1) {
					
					System.out.println("enter the first number: ");
					int num1=sc.nextInt();
					System.out.println("enter the second number: ");
					int num2=sc.nextInt();

			System.out.println("addition of "+num1+","+num2+" sis "+num1+num2);
		}
		else if (choice==2) {
			
			System.out.println("enter the first number: ");
			int num1=sc.nextInt();
			System.out.println("enter the second number: ");
			int num2=sc.nextInt();

				System.out.println("division of "+num1+","+num2+" sis "+num1/num2);
		}else if (choice==3) {
			
			System.out.println("enter the first number: ");
			int num1=sc.nextInt();
			System.out.println("enter the second number: ");
			int num2=sc.nextInt();

					System.out.println("multiplicatio of "+num1+","+num2+" sis "+num1*num2);
		}else if (choice==4) {
			
		System.out.println("enter the first number: ");
		int num1=sc.nextInt();
		System.out.println("enter the second number: ");
		int num2=sc.nextInt();

						System.out.println("modulodivision of "+num1+","+num2+" sis "+num1%num2);
						
		}else {
			System.out.println("you have entered the wrong choice");
		}
	}
}


