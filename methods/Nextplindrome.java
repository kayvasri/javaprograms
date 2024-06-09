package methods;

import java.util.Scanner;

public class Nextplindrome {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number : ");
	int number=sc.nextInt();
	
	
	System.out.println(nextOddPalindrome(number));
	

	}
	
	
	
	public static int nextOddPalindrome(int number) {
		number=nextpalindrome(number);
		while(number%2==1) {
			number=nextpalindrome(number);
			
		}
		return number;
		/*do {
		 * number=nextpalindrome(number);
		 * }while(number%==0);
		 * return number;
		 */
	}
	public static int nextpalindrome(int number) {
		++number;
		while(!checkpalindrome(number)) {
			++number;
		}
		//System.out.println("next palindrome is "+number);
		return number;
		
	}
	public static int findreverse(int number) {
		int reverse=0,remainder=0;
		while(number>0) {
		remainder=number%10;
		number=number/10;
		reverse=(reverse*10)+remainder;
	}
		return reverse;
		
		
	}
public static boolean checkpalindrome(int number) {
	int reverse=findreverse(number);
	return number==reverse;
		
}
}


