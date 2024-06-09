package forloop;

import java.util.Scanner;

public class Patternprinting2_7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				
				System.out.print("-");
			}System.out.println();
		}

	}

}
