package arraypackage;

import java.util.*;


public class findingminimumvalue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//int arr[]= {6,5,8,7,2};
		System.out.println("enter the size ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter array elements ");
		int temp=Integer.MAX_VALUE;
		for(int j=0;j<=arr.length-1;j++) {
			arr[j]=sc.nextInt();
		//System.out.println(Arrays.toString(arr));
		//for(int i=0;i<=arr.length-1;i++) {
			if (temp>arr[j]) {
				temp=arr[j];
				
				
			}
			
					
				}
		System.out.println("minimum number is "+temp);
				
				}
		
	}


