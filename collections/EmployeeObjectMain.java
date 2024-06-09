package collections;
import java.util.ArrayList;

import javax.swing.tree.ExpandVetoException;
public class EmployeeObjectMain {
	public static void main(String[] args) {
		ArrayList<EmployeeObjects> experience=new ArrayList<>();
		experience.add(new EmployeeObjects(1,"kavya",15000.1f));
		experience.add(new EmployeeObjects(2,"navya",25000.3f));
		experience.add(new EmployeeObjects(3,"sameeya",30000.3f));
	
	for(EmployeeObjects emp:experience) {
		System.out.println(emp);
		if(emp.getSalary()<20000) {
			ArrayList<EmployeeObjects> fresher=new ArrayList<>();
			fresher.add(emp);
			System.out.println("Freshers are : "+fresher);
	}
		else {
			ArrayList<EmployeeObjects> nonfresher=new ArrayList<>();
			nonfresher.add(emp);
			System.out.println("non freshers are :"+nonfresher);
		}
	
		
	}
	
	

}
}