package forloop;

import java.util.Scanner;

public class Factorsofanumberusingforloop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to find factors : ");
		int n=sc.nextInt();
		System.out.println("factors of given number");
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;	
		}
		System.out.println(fact);
		}

}
