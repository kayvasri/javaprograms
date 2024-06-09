package stringclass;

public class Findingnumbersinastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String str="kavya420kavya42kavya4kavya";
		
		
		for(int i=0;i<str.length();i++) {
			for(int number=48;number<=58;number++) {
				if(str.charAt(i)==number) {
					System.out.print(str.charAt(i));
		
				}
				
			}
		}
		String str="kavya420kavya42kavya4kavya";
		String str1="0123456789";
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<str1.length();j++) {
				if(str.charAt(i)==str1.charAt(j)) {
					System.out.print(str.charAt(i));
				}
			}
		}*/
		String str="kavya420kavya42kavya4kavya";
		for(int i=0;i<str.length();i++) {
        		if(Character.isDigit(str.charAt(i))) {
		              System.out.print(str.charAt(i));
				
			}
		String obj1=new String("geeks");
		String obj2=new String("geeks");
		if(obj1.hashCode()==obj2.hashCode())
			System.out.println("hashCode of object 1 is equal to object 2");
		if(obj1==obj2) 
			System.out.println("memory address of object1 is same as object 2");
			if(obj1.equals(obj2)){
				System.out.println("value ");
				
			}
		
		
}
	}
}

	


