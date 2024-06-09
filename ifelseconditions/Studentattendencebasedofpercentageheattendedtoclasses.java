package ifelseconditions;

import java.util.Scanner;

public class Studentattendencebasedofpercentageheattendedtoclasses {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of classes held ");
		int totalClasses=sc.nextInt();
		System.out.println("enter number of classes attend ");
		int attendedClasses=sc.nextInt();
		float attendencePercentage=((float)attendedClasses/totalClasses)*100;
		if (attendencePercentage>=75) {
			System.out.println("he is eligible for exam");
		} else {
			System.out.println("he is not eligible for exam");
				
			
		}
	}

}
