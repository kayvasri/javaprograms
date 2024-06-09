package encapsulation;

public class Student {

	private  int id;
	private String name;
	private String gender;
	private int age;
	private long phoneNumber;
	
	
	public Student() {
	}
	
	
	
	public Student(int id,String name,String gender,int age,long phoneNumber ) {
		this.id=id;
		this.name=name;
		this.gender=gender;
		this.age=age;
		this.phoneNumber=phoneNumber;
		
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getgender() {
		return gender;
	}
	public void setgender(String gender) {
		this.gender=gender;
	}
	public int getage() {
		return age;
	}
	public void setage(int age) {
		this.age=age;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setphoneNumber(long phoneNumer) {
		this.phoneNumber=phoneNumber;
		
	}
	public String toString() {
		return "Id :"+id+"\n Student name is "+name+"\n Student gender "+gender+"\n Student age is "+age+"\n phone number is "+phoneNumber;
	}
}
