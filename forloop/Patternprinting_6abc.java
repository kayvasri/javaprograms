package forloop;

import java.util.Scanner;

public class Patternprinting_6abc {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		int n=sc.nextInt();
		for( int i=97;i<=n+96;i++) {
			System.out.print((char)i);
		}
	}

}
