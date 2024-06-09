package loopingstatements;

import java.util.Scanner;

public class Sumofevennumbersusingwhileloop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		int n=sc.nextInt();
		int i=1;
		int sum=0;
		while(i<=n) {
			if(i%2==0) {
				sum=sum+i;
				//System.out.println("sum of "+n+" numbers is"+sum);
			}
			//System.out.println("sum of "+n+" numbers is"+sum);
			i++;
			}
		System.out.println("sum of "+n+" numbers is"+sum);

	}

}
