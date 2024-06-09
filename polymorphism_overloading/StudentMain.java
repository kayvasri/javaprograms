package polymorphism_overloading;

public class StudentMain {

	public static void main(String[] args) {
		Student s1=new Student(1,"kavya","CSE");
		System.out.println("Student details are "+s1.toString());
		s1.setCourse("java");
		System.out.println("student "+s1.getId()+" enrolled for "+s1.getCourse());
		System.out.println("========================");
		
		Student s2=new Student(1,"navya","CSE");
		s2.setId(2);
		System.out.println(s2);
		s2.coursesEnrolled("python", "JAVA");
		System.out.println("======"+s2.getCourse());
		System.out.println("========================");
		
		Student s3=new Student(1,"Avila","CSE");
		s3.setId(3);
		System.out.println(s3);
		s3.coursesEnrolled("Pyhton","JAVA","c");

	}

}
