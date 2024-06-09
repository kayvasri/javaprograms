package arraypackage;

import java.util.Arrays;
import java.util.Scanner;

public class Takinguserinput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]=sc.nextInt());
		}		}
		
	}


