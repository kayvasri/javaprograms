package arraypackage;

import java.util.Scanner;

public class Examplecomparinguserinputwitharrayelements {

	public static void main(String[] args) {
		System.out.println("enter the element ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int[] arr= {10,20,30,40};
		boolean bool=false; 
	
		for (int i=0;i<arr.length;i++) {
			
         if(num==arr[i]) {
				System.out.println("element found at position "+i);
		bool=true;	
		break;
         }
         }if(bool==false) {
        	 System.out.println("elemnt not found ");
         
				
				}
				
				
			}
			
		}
	


