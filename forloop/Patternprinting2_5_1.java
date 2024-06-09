package forloop;

import java.util.Scanner;

public class Patternprinting2_5_1 {

	public static void main(String[] args) {
		int value=1;
		
		
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number ");
			int n=sc.nextInt();
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					System.out.print(value+" ");
					//value++;
					
				}
				
				System.out.println();
			}


	}

}
