package loopingstatements;

import java.util.Scanner;

public class Reverseofanumberusingwhileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number ");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int lastnumber=0;
		int rev=0;
		while(number>0) {
			 lastnumber=number%10;
			 number=number/10;

			 rev=(rev*10)+lastnumber;
			 
		// System.out.println(rev);
			
			 
		}
		
		System.out.println("reverse of given number is  "+rev);
	}

}
