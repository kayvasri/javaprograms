package ifelseconditions;

import java.util.Scanner;

public class Pricediscount {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("price of an item ");
int price=sc.nextInt();
if (price>0&&price<=10000) {
	float discount=price*(float)0.1;
	 float discountPrice=price-discount;
	
	System.out.println(" 10% discount price is"+discountPrice);
} else  if(price<20000&&price>=10000) {
	float discount=price*(float)0.2;
float discountPrice=price-discount;

System.out.println("20% discount price is"+discountPrice);
}else  if(price>20000) {
	float discount=price*(float)0.25;
float discountPrice=price-discount;

System.out.println("25% discount price is"+discountPrice);
}
	}

}