package forloop;
import java.util.Scanner;
public class Findingpolindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		int reverse=findingreverse(number);
		System.out.println(reverse);
		findingpolyndrome(reverse,number);
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
		
		public static void findingpolyndrome(int rev,int number) {
			if(rev==number) {
				System.out.println("polyndrome");
			}
			else {
				System.out.println("is not polyndrome");
			}
		}
		
			
}
	
	
			

			
		
	


