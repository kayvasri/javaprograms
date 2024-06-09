package encapsulation;


public class Studentpercentage {
	
	
	int id;
	String name;
	int sub1Marks;
	int sub2Marks;
	int sub3Marks;
public Studentpercentage(int id,String name,int sub1Marks,int sub2Marks,int sub3Marks) {
	this.id=id;
	this.name=name;
	this.sub1Marks=sub1Marks;
	this.sub2Marks=sub2Marks;
	this.sub3Marks=sub3Marks;
}
public int getid() {
	return id;
}
public void setid(int id) {
	this.id=id;	
}
public String getname() {
	return name;
}
public void setnamae(String name) {
	this.name=name;	
}
public int getsub1Marks() {
	return  sub1Marks;
}
public void setsub1Marks(int sub1Marks) {
	this. sub1Marks= sub1Marks;	
}
public int getsub2Marks() {
	return  sub2Marks;
}
public void setsub2Marks(int sub2Marks) {
this.sub2Marks=sub2Marks;
}
public int getsub3Marks() {
	return  sub3Marks;
}
public void setsub3Marks(int sub3Marks) {
	this.sub3Marks=sub3Marks;
}
public float percentage() {
	return ((( (float)sub1Marks+(float)sub2Marks+ (float)sub3Marks)/300)*100);

}

public String toString() {
	return " student ID: "+id+"\n stuent name "+name+"\n percentage :"+percentage();
}


}