package collections;
import java.util.*;

public class EmployeeMain_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> emplist=new ArrayList<>();
		emplist.add(new Employee(1,"kavya"));
		emplist.add(new Employee(2,"navya"));
		emplist.add(new Employee(3,"sameeya"));
		for(Employee elist:emplist) {
			System.out.print(elist+" ");
		}
		ArrayList<Employee> e=new ArrayList<>();
		Employee e1=new Employee(1,"kavya");
		Employee e2=new Employee(2,"navya");
		e.add(e1);
		e.add(e2);
		System.out.println(e);
		
	}

}
