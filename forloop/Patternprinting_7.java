package forloop;

import java.util.Scanner;

public class Patternprinting_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		int n=sc.nextInt();
		for( int i=65;i<=n+64;i++) {
			System.out.print((char)i);
		}

	}

}
