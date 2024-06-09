package arraypackage;

import java.util.Scanner;

public class CheckingArrayElemntsPresent {

	public static void main(String[] args) {
		int arr[]= {2,4,3,12,34,42,24};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element to search ");
		int data=sc.nextInt();
	System.out.println(checkData(arr,data));

	}
	public static boolean checkData(int[] arr,int data) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==data) {
				return true;
			}
		}
		return false;
		
	}

}
