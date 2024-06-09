package forloop;
import java.util.Scanner;

public class Patternprinting2_6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		int n=sc.nextInt();
		int num=n;
		for(int i=1;i<=n;i++) {
			
			for(int j=i;j<=num;j++) {
				
				System.out.print(j);
				
			}
			System.out.println();
			num++;
		}
	}

}
