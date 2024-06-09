package polymorphism_overloading;

public class Student {
	private int id;
	private String name,branch;
	private String course;
	public Student(int id,String name,String branch) {
		this.id=id;
		this.name=name;
		this.branch=branch;
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public void coursesEnrolled(String course1,String course2) {
		System.out.println(" courses enrolled are "+course1+" "+course2);
		
	}
	
	public void coursesEnrolled(String course1,String course2,String course3) {
		System.out.println(" courses enrolled are "+course1+" "+course2+" " +course3);
		
	}
	
	public String toString() {
		return " Student Id: "+id+"\n Student name "+name+"\n branch "+branch;
	}
	

}
