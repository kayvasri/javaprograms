package forloop;

public class Countofodddnumbersandevennumbers {

	public static void main(String[] args) {
		int count=0,count1=0;
		
		for(int i=1;i<=10;i++) {
			
			if (i%2==1) {
				count++;
				
			}
				else if(i%2==0) {
					count1++; 
					
				}
			}
		System.out.println("even numbers are "+count);
		System.out.println("odd numbers are "+count1);
			
		
		
	}

}
