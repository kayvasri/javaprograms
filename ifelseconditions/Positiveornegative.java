package ifelseconditions;

import java.util.Scanner;

public class Positiveornegative {

	public static void main(String[] args) {
		System.out.println("enter the number ");
		Scanner sc=new Scanner(System.in);

		int number=sc.nextInt();
		if(number>=0) {
			System.out.println("given number is positive");
		}
		else if(number<0) {
			System.out.println("given number is negative");
		}
	}

}
