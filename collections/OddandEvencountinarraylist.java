package collections;

import java.util.HashMap;

public class OddandEvencountinarraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[]= {'a','b','c','d','a','a','b','c','d','g','d','g','h'};
HashMap<Character,Integer> s=new HashMap<>();
int  count=0;
for(int i=0;i<arr.length;i++) {
	if(s.containsKey(arr[i])) {
		count=s.get(arr[i]);
		s.put( arr[i],count+1);
		
		}
	else {
		s.put( arr[i],1);
		 
	}
	//System.out.println(arr[i]);
	//System.out.println(s.get(arr[i]));
	System.out.println(s.keySet());
System.out.println(s);

int oddcount=0,evencount=0;
for(Integer e:s.values()) {
	if(e%2!=0) {
		oddcount++;
	}
	else {
		evencount++;
	}
}

System.out.println(" odd count " +oddcount);
System.out.println(" even count "+evencount);


}
}
}
