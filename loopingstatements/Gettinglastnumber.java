package loopingstatements;
import java.util.Scanner;

public class Gettinglastnumber {

	public static void main(String[] args) {
		
			System.out.println("enter the number ");
			Scanner sc=new Scanner(System.in);
			int number=sc.nextInt();
			int lastnumber=0;
			while(number>0) {
				 lastnumber=number%10;
			 System.out.println(lastnumber);
				 number=number/10;
				 
			}

	}

}
