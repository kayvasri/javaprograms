package stringclass;
import java.util.*;

public class Box{

	
		
	
		int width;
		int height;
		int length;
		int volume;
		Box (){
		
			width=5;
			height=5;
			length=6;
		}
		void volume() {
			volume=width*height*length;
			
		}
		
	}
		class ConstructorOutput{
			public static void main(String[] args) {
				Box obj=new Box();
				obj.volume();
				System.out.println(obj.volume);
			}
			
		}
