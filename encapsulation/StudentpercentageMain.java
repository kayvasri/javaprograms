package encapsulation;

public class StudentpercentageMain {

	public static void main(String[] args) {
		Studentpercentage s=new Studentpercentage(1,"kavya",60 ,70,80);
		System.out.println("================");
		System.out.println("student 1 ");
		System.out.println("================");
		System.out.println(s.toString());
		Studentpercentage  s1=new Studentpercentage(1,"navya",90 ,90,90);
		s1.setid(2);
//		s.setname("navya");
//		s.setsub1Marks(90);
//		s.setsub2Marks(90);
//		s.setsub3Marks(90);
		System.out.println("================");
		System.out.println("student 2");
		System.out.println("================");
		System.out.println(s1.toString());
		Studentpercentage s2=new Studentpercentage(1,"Avila",100,100,100);
		s2.setid(3);
//		s.setnamae("Avila");
//		s.setsub1Marks(100);
//		s.setsub2Marks(100);
//		s.setsub3Marks(100);
		System.out.println("================");
		System.out.println("student 3");
		System.out.println("================");
		System.out.println(s2.toString());
				
		if(s.percentage()>s1.percentage()&&s.percentage()>s2.percentage()) {
			System.out.println(s.getname()+"pecentage is high ");
		}
			else if(s1.percentage()>s.percentage()&&s1.percentage()>s2.percentage()) {
				System.out.println(s1.getname()+" pecentage is high ");	
		}
			else 
				System.out.println(s2.getname()+" pecentage is high ");	
	
	
	
	}
}
