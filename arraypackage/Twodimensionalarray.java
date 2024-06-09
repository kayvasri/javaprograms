package arraypackage;

public class Twodimensionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2,3},{1,3}};
		int sum=0;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			
			count=count+arr[i].length;
			
			for(int j=0;j<arr[i].length;j++) {
				
				System.out.println(arr[i][j]);
				
				sum=sum+arr[i][j];
				//System.out.println(sum);
}
		
		System.out.println(sum);
		System.out.println(count);
	}

}
}
