package arraypackage;
import java.util.*;
public class Creatingbooleanaray {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	//System.out.println("enter the size ");
	//int size=sc.nextInt();
	//boolean bool[]=new boolean[5];
	//System.out.println(Arrays.toString(bool));
	//int arr[]=new int[size];
	//System.out.println("enter the elements");
	int arr[]= {10,9,8,7};
	int count=1;
	 System.out.println(Arrays.toString(arr));
	 for( int j=1;j<=count;j++) {
	for( int i=0;i<arr.length-1;i++) {
	
	if(arr[i]>arr[i+1]) {

	arr[i]=arr[i]+arr[i+1];
	arr[i+1]=arr[i]-arr[i+1];
	arr[i]=arr[i]-arr[i+1];
	count++;
	
	System.out.println(Arrays.toString(arr));
	}
	
	 }
	
	 }
	 System.out.println("count is "+count);
	 }
}
