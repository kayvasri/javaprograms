package ifelseconditions;
import java.util.Scanner;

public class Checkingpositiveornegativenumber {

	public static void main(String[] args) {
		System.out.println("enter the year : ");
		
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		if (year%4==0&&year%100!=0) {
			System.out.println("the year "+year+" is leap year");
		} else if(year%400==0) {
			System.out.println("the year "+year+" is a leap year");
		} else {
			System.out.println("the year "+year+" is a leap year");
		}
		

	}

}
