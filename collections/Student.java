package collections;
import java.util.Scanner;
public class Student {
	
Scanner sc=new Scanner(System.in);	

private int  id;
private String name;
private int marks[];
 static int idgen=0;

public Student()
{
	id=++idgen;
	}
public Student(String name, int marks[]) {
	this();
	this.name=name;
	this.marks=marks;
}
public int getId() {
	return id;
}
public void setMraks(int marks[]) {
	this.marks=marks;
}
public  String getName(){
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int[] getMarks() {
	return marks;
}
public float calPercentage() {
	
	float total=0;
for(int i=0;i<marks.length;i++) {
	total=total+marks[i];	
}
return ((total/400)*100);
}


public String toString() {
	return " id "+id+"\n name "+name+"\n percentage "+calPercentage();
	
}

}

