package forloop;

import java.util.Scanner;

public class Patternprint2_2 {

	public static void main(String[] args) {
		int num=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row number ");
		int rowNum=sc.nextInt();
		System.out.println("enter colounm number ");
		int coloumNum=sc.nextInt();
		for (int i=1;i<=rowNum;i++) {
			for(int j=1;j<=coloumNum;j--) {
				System.out.print("*");
			}System.out.println();
		}
	}

}
