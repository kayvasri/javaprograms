package inheritance;
 
public class PGclass extends UGclass {
	String university,spetialization;
	PGclass(){}
	public PGclass( int rollno,String name,String city,String collegename,String branch,String university,String spetialization) {
		super(rollno,name,city,collegename,branch);
		this.university = university;
		this.spetialization = spetialization;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getSpetialization() {
		return spetialization;
	}
	public void setSpetialization(String spetialization) {
		this.spetialization = spetialization;
	}
	public String toString() {
		return super.toString()+"\n university "+university+"\n spetialization "+spetialization;
	}
	
}
