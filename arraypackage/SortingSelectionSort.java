package arraypackage;

public class SortingSelectionSort {

	public static void main(String[] args) {
		
		int arr[]= {5,4,1,6,2};
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];	
			}
			System.out.println(min);
		}

	}

}
