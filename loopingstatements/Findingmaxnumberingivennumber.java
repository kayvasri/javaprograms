package loopingstatements;

import java.util.Scanner;

public class Findingmaxnumberingivennumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value ");
		int number=sc.nextInt();
		int rem=0; int max=0;
		while(number>0) {
			rem=number%10;
			number/=10;
			
			if(max<rem) {
				max=rem;
				
			}
		
		}
		System.out.println(max);
		
	}

}
