package abstraction_Student;

public class StudentMain {

	public static void main(String[] args) {
		int marks[]= {80,90,60,50,93};
		Class8 c8=new Class8("kavya",marks);
		
		System.out.println(c8.toString());
		System.out.println("==========================");
		int theorymarks[]= {100,78,98};
		int practicalmarks[]= {89,78,96};
		int languagemarks[]= {90,90};
				
		Class11 c11=new Class11("navya",theorymarks,practicalmarks,languagemarks);
		System.out.println(c11);

	}

}
