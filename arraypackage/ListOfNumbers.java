package arraypackage;
import java.util.Scanner;

public class ListOfNumbers {public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of array :");
	int size=sc.nextInt();
	int arr[]=new int [size];
	System.out.println("Enter array elements ");
	for(int i=0;i<size;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println(checkArray(arr));
	
}

public static boolean checkArray(int arr[]) {
boolean bool=false;
Scanner sc=new Scanner(System.in);
System.out.println("enter number to search in array:");
int number=sc.nextInt();
for(int ele:arr) {
if(ele==number) {
	bool=true;
}
}
	return bool;
}

}


