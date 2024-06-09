package arraypackage;

public class TwodimensionalarrayForeachloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{2,3,4,4},{3,5,6,6}};
		int count=0;
		for(int[] a:arr) {
			count+=a.length;
			for(int b:a) {
				System.out.println(b );
				// count++;
			}
			
		}
		System.out.println(count);
	}
	}


