package collections;
import java.util.Scanner;
import java.util.LinkedList;

public class StudentDemo {

	public static void main(String[] args) {
	LinkedList<Student> s1=new LinkedList<Student>();
	int marks[]= {80,90,50,30};
	s1.add(new Student("kavya",marks));
	for(Student first:s1) {
		System.out.println("first student details are ");
		System.out.println(first.toString());
	}
	int marks1[]= {60,70,90,86};
	LinkedList<Student> s2=new LinkedList<>();
	s2.add(new Student("navya",marks1));
	for(Student second:s2) {
		System.out.println("second student details are ");
		System.out.println(second.toString());
	}
	int marks3[]= {60,70,80,90};
	LinkedList<Student> s3=new LinkedList<>();
	s3.add(new Student("avila",marks3));
	for(Student third:s3) {
		System.out.println("third student details ");
		System.out.println(third);
	}
	}
}
