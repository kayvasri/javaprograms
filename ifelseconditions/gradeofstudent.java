package ifelseconditions;

import java.util.Scanner;

public class gradeofstudent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the marks in first subject");
		int sub1=sc.nextInt();
		System.out.println("enter the marks in second subject");
		int sub2=sc.nextInt();
		System.out.println("enter the marks in third subject");
		int sub3=sc.nextInt();
		float percentage=(((float)sub1+sub2+sub3)/300)*100;
		
		if (percentage>=90) {
			System.out.println("garde is A");
		}else if(percentage>=70&&percentage<90) {
			System.out.println("grade is B");
		}else if(percentage>=50&&percentage<70) {
		 	System.out.println("grade is C");
		}else if(percentage<50) {
			System.out.println("fail");
		}
			else {
			System.out.println("invalid");
		}
		

	}

}
