package arraypackage;

public class Exampleofarray {
	public static void main(String[] args) {
		int[] arr= {10,15,20,30};
		
		 int sum=findingsum(arr);
		 System.out.println();
		 System.out.println(sum);
	
	}
public static int findingsum(int[] arr) {
	int sum=0;
	for(int i=0;i<arr.length;i++) {
	
	sum=sum+arr[i];
	System.out.print(arr[i]+" ");
	
	
}
	
	return sum;
}



}