package arraypackage;

public class Sumoftwodimensionalarray {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3,4,},{1,2,3,4,},{1,2,3,4,},{1,2,3,4,}};
		int dsum=0;
		int rdsum=0;
		int totalsum=0;
		for (int i=0,j=0;i<arr.length;i++,j++) {
			dsum=dsum+arr[i][j];
			
		}
		System.out.println(dsum);
		for (int i=0,j=3;i<arr.length;i++,j--) {
			rdsum=rdsum+arr[i][j];
			
			
		}System.out.println(rdsum);
		totalsum=dsum+rdsum;
		System.out.println(totalsum);
				
			}
			
	

}
