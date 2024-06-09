package loopingstatements;

import java.util.Scanner;

public class Printingonlyevennumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		
		int rem=0;
		while(number>0) {
			rem=number%10;
			number/=10;
			if(rem%2==0) {
				System.out.println(rem);
			}
		}

	}

}
