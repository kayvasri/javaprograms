package ifelseconditions;

import java.util.Scanner;

public class Secondlargestofthreedistinctnumbers {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
			System.out.println("enter the first number");
	int first=sc.nextInt();
	System.out.println("enter the second number");
	int second=sc.nextInt();
	System.out.println("enter the third number");
	int third=sc.nextInt();
	if(first!=second&&second!=third) {
		System.out.println(0);
	} else if(first==second&&first!=third) {
		System.out.println(1);
	}else if(first==second&&second==third) {
		System.out.println(2);
	}
	}
		
		
	}
	
	

	


