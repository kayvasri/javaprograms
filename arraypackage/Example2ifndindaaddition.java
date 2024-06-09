package arraypackage;

public class Example2ifndindaaddition {

	public static void main(String[] args) {
		int[] arr= {10,90,80,90};
		displayArrayElements(arr);
		int sum=findsum(arr);
		System.out.println("\n"+sum);
		arr[2]=100;
		displayArrayElements(arr);
		sum=findsum(arr);
		System.out.println("\n"+sum);
		
	}
	public static void  displayArrayElements(int[] num) {
		for (int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
	}
		public static int findsum(int[] num) {
			int sum=0;
			
			for(int i=0;i<num.length;i++) {
				sum=sum+num[i];
			}
			return sum;
		
		
	}

}
