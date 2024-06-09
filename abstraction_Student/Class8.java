
package abstraction_Student;
import java.util.*;
public class Class8 extends Student{
private int submarks[];
	Class8(){
		
	}

	public int[] getMarks() {
		return submarks;
	}

	public void setMarks(int submarks[]) {
		this.submarks = submarks;
	}

	public Class8( String name, int submarks[]) {
		super(name);
		this.submarks =submarks;
	}
	
	public double findPercentage() {
		double total=0;
		for(int i=0;i<submarks.length;i++) {
			total=total+submarks[i];
		}
		//System.out.println("percentage of five subjects in class8 "+(total/5f));
		return (total/5);
	}

	
	public String toString() {
		return super.toString() +"\n marks=" + Arrays.toString(submarks)+"\n prcentage is "+findPercentage();
	}
}
