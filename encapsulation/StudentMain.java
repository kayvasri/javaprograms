package encapsulation;

public class StudentMain {

	public static void main(String[] args) {
		Student s1=new Student(1,"kavya","female",21,9515998093L);
		System.out.println("==============================");
		System.out.println(s1.getId());
		System.out.println("==============================");
		System.out.println("first student "+s1);
		s1.setId(2);
		s1.getId();
		System.out.println("==============================");
		System.out.println(s1.getId());
		System.out.println("==============================");
		s1.setName("avila");
		s1.setgender("female");
		s1.setage(27);
		s1.setphoneNumber(1234567890L);
		
		System.out.println("second student  "+s1.toString());
		s1.getId();
		s1.setId(3);
		s1.setName("pillala navya");
		s1.setgender("0.5");
		s1.setage(22);
		s1.setphoneNumber(6303735815L);
		System.out.println("==============================");
		System.out.println(s1.getId());
		System.out.println("==============================");
		System.out.println("Dabba moham student  "+s1.toString());
		
	}

}

