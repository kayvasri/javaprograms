package forloop;

import java.util.Scanner;

public class Patternprinting_4evennumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		int number=sc.nextInt();
		for(int i=2;i<=number;i=i+2) {
			System.out.print(i);
	}

}
}