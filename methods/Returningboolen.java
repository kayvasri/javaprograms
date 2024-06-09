package methods;

import java.util.Scanner;

public class Returningboolen {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		int reverse=findingreverse(number);
		System.out.println(reverse);
	//	boolean bool=findingpolyndrome(reverse,number);
		//if(bool) 
		if(findingpolyndrome(reverse,number)){
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
		
	
		}
	public static int findingreverse( int num) {
		int rem=0,rev=0;
		
		while(num>0) {
			rem=num%10;
			num=num/10;
			rev=(rev*10)+rem;
			
			
		}
		return rev;
	}
		
		public static boolean findingpolyndrome(int rev,int number) {
			/*if(rev==number) {
				return true;
			}
			else {
				return false;
			}
		// TODO Auto-generated method stub*/
			return number==rev;//it will give boolean s

	}

}
