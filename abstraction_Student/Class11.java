package abstraction_Student;
import java.util.*;

public class Class11  extends Student{
	private int theorymarks[];
	private int practicalmarks[];
	private int languagemarks[];
	
	Class11(){}
	public Class11(String name,int theorymarks[], int practicalmarks[], int languagemarks[]) {
		super(name);
		this.theorymarks = theorymarks;
		this.practicalmarks = practicalmarks;
		this.languagemarks = languagemarks;
	}
	
	
	public int[] getTheorymarks() {
		return theorymarks;
	}


	public void setTheorymarks(int theorymarks[]) {
		this.theorymarks = theorymarks;
	}


	public int[] getPracticalmarks() {
		return practicalmarks;
	}


	public void setPracticalmarks(int[] practicalmarks) {
		this.practicalmarks = practicalmarks;
	}

	public int[] getLanguagemarks() {
		return languagemarks;
	}

	public void setLanguagemarks(int[] languagemarks) {
		this.languagemarks = languagemarks;
	}


	
	public double findPercentage() {
		
		int total=0;
		for(int i=0;i<theorymarks.length;i++) {
			total=total+theorymarks[i];
		}
		float theorymarks=total;
		
		int total1=0;
		for(int i=0;i<languagemarks.length;i++) {
			total1=total1+languagemarks[i];
		}
		float languagemarks=total1;
		
		int total2=0;
		for(int i=0;i<practicalmarks.length;i++) {
			total2=total2+practicalmarks[i];
		}
		float practicalpercentage=((total2)*0.4f);
		
		
		float theorypercentage=((theorymarks)*0.6f);
		float totalpercentage= (theorypercentage+practicalpercentage+languagemarks);
		//System.out.println("total percentage is :"+totalpercentage);
		return totalpercentage/6;
	}

	@Override
	public String toString() {
		return super.toString()+ "\n theorymarks=" + Arrays.toString(theorymarks) + "\n practicalmarks="
				+ Arrays.toString(practicalmarks) + "\n languagemarks=" + Arrays.toString(languagemarks)+"\n percentage is "+findPercentage();
	}
}