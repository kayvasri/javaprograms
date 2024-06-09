package methods;

import java.util.Scanner;

public class Additionofnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		int num=sc.nextInt();
		int sum=addition(num);
		System.out.println("sum is "+sum);
		if(addition(num)<100) {
		System.out.println("greater");
	}else {
		System.out.println(4);
	}

	} 
	public static int addition(int num) {
		return num+num;
	}

}
