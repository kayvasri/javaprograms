package arraypackage;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfFirstTwoSmallNUmbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array elements ");
		for(int i=0; i<size;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("sum of first two small numbers "+(arr[0]+arr[1]));
		
	}

}
