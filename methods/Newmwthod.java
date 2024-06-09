package methods;

import java.util.Scanner;

public class Newmwthod {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		addition(num1,num2);
		subtraction(num1,num2);
		multiplication(num1,num2);
		division(num1,num2);
		
		
		
	}
	public static void addition(int number1,int number2) {
		int sum=number1+number2;
		System.out.println("addition of "+number1+","+number2+" is "+sum); 
	}
	public static void subtraction(int number1,int number2) {
		int difference=number1-number2;
		System.out.println("subtraction of "+number1+","+number2+" is "+difference);
		
	}
	public static void multiplication(int number1, int number2) {
		int multiplication=number1*number2;
		System.out.println("multiplication of "+number1+","+number2+" is "+multiplication);
	}
	public static void division(int number1,int number2) {
		int division=number1/number2;
		System.out.println("division of "+number1+","+number2+" is "+division);
	}
	
			
		
		
	}

