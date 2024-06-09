package ifelseconditions;

import java.util.Scanner;

public class Secondlrgestingiventhreedistinctnumbers1 {

	public static void main(String[] args) {Scanner sc=new Scanner(System.in);
	System.out.println("enter the  number");
int first=sc.nextInt();
int second=sc.nextInt();
int third=sc.nextInt();
if(first!=second&&second!=third) {
	int sum=first+second+third;
	System.out.println(first+""+second+""+third);
	System.out.println("given number is distinct number");
	
	System.out.println("the sum of three numbers are : "+sum);
}else {
	System.out.println(first+""+second+""+third);
		System.out.println("given number is not a distinct number");
	
	}
	}

}
