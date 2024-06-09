package loopingstatements;

import java.util.Scanner;

public class Loopingexample {

	public static void main(String[] args) {
		/*System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		int i=1,j=1;
		while(i<6) {
			System.out.println(i);
			i++;
		} while(j<11) {
			if(j%2==1) {
			System.out.println(j);
		}
					j++;
				}
		
		int i=1,j=0;
		while(i<=10) {
			j=j+i;
			i++;	
		}
		System.out.println(j);*/
		
	System.out.println("enter the number : ");
	Scanner sc=new Scanner(System.in);
	int number=sc.nextInt();
	int i=1;
	int mul;
	while(i<=10) {
	mul=number*i;
		System.out.println(number +"*"+i+" = "+mul);
		i++;
	}
			}
			
		}
		

	
