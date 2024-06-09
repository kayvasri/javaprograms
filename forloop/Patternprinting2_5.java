package forloop;

import java.util.Scanner;

public class Patternprinting2_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=97;j<=102;j++) {
				System.out.print((char)j+" ");
			}
			System.out.println();
		}

	}

}
