package stringclass;


	import java.util.Scanner;
	 
	public class Reverse {
	 
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        String original, reverse = "";
	        System.out.println("Enter the string to be reversed");
	        Scanner sc = new Scanner(System.in);
	        original = sc.nextLine();
	        int length = original.length();
	        for(int i=length-1; i>=0; i--) {
	            reverse = reverse + original.charAt(i);   //used inbuilt method charAt() to reverse the string
	        }
	        System.out.println(reverse);
	    }
	 

}
