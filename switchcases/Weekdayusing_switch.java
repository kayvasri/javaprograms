  package switchcases;

import java.util.Scanner;

public class Weekdayusing_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the choice : ");
	Scanner sc=new Scanner(System.in);
	String choice=sc.nextLine();
	switch(choice) {
	case "sd":
		System.out.println("sunday");
		//break;
	case "se":
		System.out.println("monday");
		//break;
	case "sr":
		System.out.println("tuesday");
		//break;
	case"sc":
		System.out.println("wednwsday");
		//break;
	case "si":
		System.out.println("thursday");
		//break;
	case "sp":
		System.out.println("friday");
		//break;
	case "so":
		System.out.println("saturday");
		//break;
		default :
			System.out.println("you have entered invalid choice");
		
	}
	}

}
