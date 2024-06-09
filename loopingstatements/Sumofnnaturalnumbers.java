package loopingstatements;

import java.util.Scanner;

public class Sumofnnaturalnumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("entre the number :");
		int i=0;
		int number=sc.nextInt();
		int sum=0;
	while(i<=number) {
			//int sum=number*(number+1)/2;
			
			sum=sum+i;
			//System.out.println("sum of "+number+" natural numbers is "+sum);
			i++;
		}
	System.out.println("sum of "+number+" natural numbers is "+sum);
		// TODO Auto-generated method stub

	}

}
