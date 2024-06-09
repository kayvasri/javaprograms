package forloop;

import java.util.Scanner;

public class Printingpattern2_10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		int number=sc.nextInt();
		for(int i=9;i>=number;i--) {
			System.out.print(i);
		}

	}
 
}
