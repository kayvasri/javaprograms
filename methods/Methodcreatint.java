package methods;

import java.util.Scanner;

public class Methodcreatint {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two values ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		doTheOperation(num1,num2);
		
	}
	public static void doTheOperation(int num1, int num2){
	System.out.println("addition of "+num1+","+num2+" is "+(num1+num2));
	System.out.println("subtraction of "+num1+","+num2+" is "+(num1-num2));
	System.out.println("multiplication of "+num1+","+num2+" is "+(num1*num2));
	System.out.println("division of "+num1+","+num2+" is "+" is "+(num1/num2));
	System.out.println("modulo division of "+num1+","+num2+" is "+(num1%num2));
		
	
		
	}
	
		
	}


