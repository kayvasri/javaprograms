 package stringclass;

import java.util.*;
public class Countingvowelsfromgivenstring {

	public static void main(String[] args) {
		
				//String str="AVILA";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string : ");
		String str=sc.nextLine();
		
		
				int count=0;
				// char v='a';
				str=str.toLowerCase();
					System.out.println(str);
					for (int i=0;i<str.length();i++) {
						//if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
					if(str.charAt(i)=='a') {
						count++;
						System.out.println(str.charAt(i)+" count is "+count);
						//count++;
					}

					if(str.charAt(i)=='e') {
//						count++;
						int count1=0;
						count1++;
						System.out.println(str.charAt(i)+" count is "+count1);
						
					}
					
					if(str.charAt(i)=='i') {
//						count++; 
						int count2=0;
						count2++;
						System.out.println(str.charAt(i)+" count is "+count2);
						
					}
					if(str.charAt(i)=='o') {
//						count++;
						int count3=0;
						count3++;
						System.out.println(str.charAt(i)+" count is "+count3);}
					
					if(str.charAt(i)=='u') {
//						count++;
						int count4=0;
						count4++;
						System.out.println(str.charAt(i)+" count is "+count4);
	                }
				}
	}
}


