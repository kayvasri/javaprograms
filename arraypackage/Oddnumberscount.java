package arraypackage;

import java.util.HashMap;
import java.util.Scanner;

public class Oddnumberscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array elements ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
//			if(arr[i]%2==1) {
//				sum=sum+arr[i];
//			}
//		}
//		System.out.println("Odd elements count is "+sum);

	HashMap<Integer,Integer> list=new HashMap<>();
	int  count=0;
	for(int i=0;i<arr.length;i++) {
		if(list.containsKey(arr[i])) {
			count=list.get(arr[i]);
			list.put( arr[i],count+1);
			
			}
		else {
			list.put( arr[i],1);
			 
		}
	
}
	int count1=0;
	for(Integer e:list.values()) {
		if(e%2==1) {
			count1+=e;
		}
		
	}

	System.out.println(" odd count " +count1);

}
}
