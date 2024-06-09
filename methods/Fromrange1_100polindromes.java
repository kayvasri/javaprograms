package methods;

import java.util.Scanner;

public class Fromrange1_100polindromes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		int num=sc.nextInt();
		nPolyndromes(num);
		
	}
public static void nPolyndromes(int upperlimit) {
	for (int i=1;i<upperlimit;i++) {
		if(checkPalindrome(i)) {
			System.out.println(i);
	}
    }
}

public static int findReverse(int number)
{
	int remainder=0,reverse=0;
	while(number>0) {
		remainder=number%10;
		number=number/10;
		reverse=reverse*10+remainder;
	}
	return reverse;
	
	}
public static boolean checkPalindrome(int number) {
	int reverse=findReverse(number);
	return number==reverse;
}
}