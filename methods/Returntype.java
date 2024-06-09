package methods;



	import java.util.Scanner;

import javax.swing.JTable.PrintMode;
	public class Returntype {
	

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the values");
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			//addition(num1,num2);
			int number1=addition(num1,num2);
			System.out.println("addition of "+num1+","+num2+" is "+number1);
			int number2=subtraction(num1,num2);
			System.out.println("subtraction of "+num1+","+num2+" is "+number2);
			
			int number3=multiplication(num1,num2);
			System.out.println("addition of "+num1+","+num2+" is "+number3);
		float number4=division(num1,num2);
			System.out.println("addition of "+num1+","+num2+" is "+number4);
			double number5=modulodivision(num1,num2);
			System.out.println("addition of "+num1+","+num2+" is "+number5);
			
			
		}
		public static int addition(int number1,int number2) {
			int sum=number1+number2;
			//System.out.println("addition of "+number1+","+number2+" is "+sum);
			return sum;
		}
		public static int subtraction(int number1,int number2) {
			int difference=number1-number2;
			//System.out.println("subtraction of "+number1+","+number2+" is "+difference);
			return difference;
		}
		public static int multiplication(int number1, int number2) {
			int multiplication=number1*number2;
			//System.out.println("multiplication of "+number1+","+number2+" is "+multiplication);
			return multiplication;
		}
		public static float division(int number1,int number2) {
			int division=(number1/number2);
			//System.out.println("division of "+number1+","+number2+" is "+division);
			return division;
		}
		public static double modulodivision(int number1,int number2) {
			int modulodivision=(number1/number2);
			//System.out.println("division of "+number1+","+number2+" is "+division);
			return modulodivision;
		
				
			
			
		


	}}


