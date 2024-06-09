package abstraction_Student;

 abstract public class Student {
	private int id;
	 String name;
	 static int idgen=0;
	 abstract public double findPercentage();
	 public Student() {
		 id=++idgen;
	 }
	 public Student(String name) {
		 this();
		
		this.name=name;
	 }
	 public  int getId() {
		 return id;
	 }
	
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name=name;
	 }
public String toString() {
	return " \n id is "+id+"\n name is "+name;
}
}
