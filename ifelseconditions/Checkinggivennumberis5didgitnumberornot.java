
package ifelseconditions;
import java.util.Scanner;

public class Checkinggivennumberis5didgitnumberornot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		if(number<99999&&number>9999) {
			System.out.println("number is 5-digit number");
		}else {
			System.out.println("number is not a 5-digit number");
		}
		
		
	}

}
