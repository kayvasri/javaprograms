package collections;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
public class LinkedListExample {
public static void main(String[] args) {
	LinkedList<String> name=new LinkedList<>();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size ");
	int size=sc.nextInt();
	sc.nextLine();
	for(int i=0;i<=size;i++) {
		System.out.println("enter the name ");
		name.add(sc.nextLine());
	}
		name.addFirst("sidhusri4");
		name.addLast("kavya");
	
	for(String names:name) {
		System.out.println(names);
	}
	System.err.println(name.contains("kavya"));
	Collections.sort(name);
	System.out.println("====================");
	System.out.println(name);
	
}
}
