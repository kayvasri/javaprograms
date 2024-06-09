package arraypackage;

public class Twodimensionalarraycreating {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3,4,},{1,2,3,4,},{1,2,3,4,},{1,2,3,4,}};
		//System.out.println(arr[0][0]+"\n"+arr[1][1]+"\n"+arr[2][2]+"\n"+arr[3][3]);
		
		for (int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				//System.out.print(arr[i][j]);
				if(i==j) {
					
					System.out.print(arr[i][j]);
				}
			}
			System.out.println();
				
		}
	}

}
