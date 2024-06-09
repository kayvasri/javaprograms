
import java.util.*;

public class Food {
	String pizza1 = "The 4 Cheese Pizza";
	String pizza2 = "Farmhouse";
	String pizza3 = "Cheese n Corn";
	String pizza4 = "Peppy Paneer";

	String bur1 = "American Cheese Supreme";
	String bur2 = "Maharaja Mac";
	String bur3 = "Cheese Lava American";
	String bur4 = "Triple Cheese American";

	String sand1 = "Club Sandwich";
	String sand2 = "Veg Cheese Grilled Sandwich";
	String sand3 = "Chilly Panner Sandwich";

	String bev1 = "Coke";
	String bev2 = "Pepsi";
	String bev3 = "Choclate Smoothie";
	String bev4 = "Choclate Shake";

	String des1 = "Choclate Chip Muffin";
	String des2 = "Choco Lava Cake";
	String des3 = "Brownie Fantasy";

	String name;
	static String again;
	static int choice = 0;
	int quantity;
	int pchoice;
	int pchoice1;
	static Scanner s = new Scanner(System.in);

	public void pizzaMenu() {
		System.out.println("\t\t#PIZAAS-");
		System.out.println("\t\t1. " + pizza1);
		System.out.println("\t\t2. " + pizza2);
		System.out.println("\t\t3. " + pizza3);
		System.out.println("\t\t4. " + pizza4);
		System.out.println("Please Select Your Flaver:");
		pchoice = s.nextInt();

		if (pchoice >= 1 && pchoice <= 5) {
			System.out.println("\t\t1.Small Rs.250");
			System.out.println("\t\t2.Regular Rs.400");
			System.out.println("\t\t3.Large Rs.600");
			System.out.println("Choose Size Please:");
			pchoice1 = s.nextInt();

			if (pchoice1 >= 1 && pchoice1 <= 3) {
				System.out.println("Enter Quantity:");
				quantity = s.nextInt();
				switch (pchoice1) {
				case 1:
					choice = 250 * quantity;
					break;
				case 2:
					choice = 400 * quantity;
					break;
				case 3:
					choice = 600 * quantity;
					break;
				default:
					System.out.println("Wrong Choice!!");
				}

				switch (pchoice1) {
				case 1:
					System.out.println("\t|\t----------Your Order----------");
					System.out.println("\t|\t" + quantity + "\t" + pizza1);
					System.out.println("\t|\tYour Total Bill is:  " + choice);
					System.out.println("\t|\tThank You for Ordering from Disha's Place");
					System.out.println("\t|\tVisit Again(*_*)");
					System.out.println("------------------------------------------------");
					break;
				case 2:
					System.out.println("\t|\t-----Your Order-----");
					System.out.println("\t|\t" + quantity + "\t" + pizza2);
					System.out.println("\t|\tYour Total Bill is:  " + choice);
					System.out.println("\t|\tThank You for Ordering from Disha's Place");
					System.out.println("\t|\tVisit Again(*_*)");
					System.out.println("------------------------------------------------");
					break;
				case 3:
					System.out.println("\t|\t-----Your Order-----");
					System.out.println("\t|\t" + quantity + "\t" + pizza3);
					System.out.println("\t|\tYour Total Bill is:  " + choice);
					System.out.println("\t|\tThank You for Ordering from Disha's Place");
					System.out.println("\t|\tVisit Again(*_*)");
					System.out.println("------------------------------------------------");
					break;
				case 4:
					System.out.println("\t|\t-----Your Order-----");
					System.out.println("\t|\t" + quantity + "\t" + pizza4);
					System.out.println("\t|\tYour Total Bill is:  " + choice);
					System.out.println("\t|\tThank You for Ordering from Disha's Place");
					System.out.println("\t|\tVisit Again(*_*)");
					System.out.println("------------------------------------------------");
					break;
				default:
					System.out.println("Wrong Choice!!");
				}

			}
		}
	}

	public void burgerMenu() {
		System.out.println("\t\t#BURGERS-");
		System.out.println("\t\t1. " + bur1 + " Rs.124");
		System.out.println("\t\t2. " + bur2 + " Rs.220");
		System.out.println("\t\t3. " + bur3 + " Rs.230");
		System.out.println("\t\t4. " + bur4 + " Rs.200");
		System.out.println("Please Select Your Burger:");
		pchoice1 = s.nextInt();

		if (pchoice1 >= 1 && pchoice1 <= 3) {
			System.out.println("Enter Quantity:");
			quantity = s.nextInt();
			switch (pchoice1) {
			case 1:
				choice = 124 * quantity;
				break;
			case 2:
				choice = 220 * quantity;
				break;
			case 3:
				choice = 230 * quantity;
				break;
			case 4:
				choice = 200 * quantity;
				break;

			default:
				System.out.println("Wrong Choice!!");
			}

			switch (pchoice1) {
			case 1:
				System.out.println("\t|\t-----Your Order-----");
				System.out.println("\t|\t" + quantity + "\t" + bur1);
				System.out.println("\t|\tYour Total Bill is:  " + choice);
				System.out.println("\t|\tThank You for Ordering from Disha's Place");
				System.out.println("\t|\tVisit Again(*_*)");
				System.out.println("------------------------------------------------");
				break;
			case 2:
				System.out.println("\t|\t-----Your Order-----");
				System.out.println("\t|\t" + quantity + "\t" + bur2);
				System.out.println("\t|\tYour Total Bill is:  " + choice);
				System.out.println("\t|\tThank You for Ordering from Disha's Place");
				System.out.println("\t|\tVisit Again(*_*)");
				System.out.println("------------------------------------------------");
				break;
			case 3:
				System.out.println("\t|\t-----Your Order-----");
				System.out.println("\t|\t" + quantity + "\t" + bur3);
				System.out.println("\t|\tYour Total Bill is:  " + choice);
				System.out.println("\t|\tThank You for Ordering from Disha's Place");
				System.out.println("\t|\tVisit Again(*_*)");
				System.out.println("------------------------------------------------");
				break;
			case 4:
				System.out.println("\t|\t-----Your Order-----");
				System.out.println("\t|\t" + quantity + "\t" + bur4);
				System.out.println("\t|\tYour Total Bill is:  " + choice);
				System.out.println("\t|\tThank You for Ordering from Disha's Place");
				System.out.println("\t|\tVisit Again(*_*)");
				System.out.println("------------------------------------------------");
				break;
			default:
				System.out.println("Wrong Choice!!");
			}
		}
	}

	public void sandwichMenu() {
		System.out.println("\t\t#SANDWICHES-");
		System.out.println("\t\t1. " + sand1 + " Rs.80");
		System.out.println("\t\t2. " + sand2 + " Rs.90");
		System.out.println("\t\t3. " + sand3 + " Rs.100");
		System.out.println("Please Select Your Sandwich:");
		pchoice1 = s.nextInt();

		if (pchoice1 >= 1 && pchoice1 <= 3) {
			System.out.println("Enter Quantity:");
			quantity = s.nextInt();
			switch (pchoice1) {
			case 1:
				choice = 80 * quantity;
				break;
			case 2:
				choice = 90 * quantity;
				break;
			case 3:
				choice = 100 * quantity;
				break;
			default:
				System.out.println("Wrong Choice!!");
			}

			switch (pchoice1) {
			case 1:
				System.out.println("\t|\t-----Your Order-----");
				System.out.println("\t|\t" + quantity + "\t" + sand1);
				System.out.println("\t|\tYour Total Bill is:  " + choice);
				System.out.println("\t|\tThank You for Ordering from Disha's Place");
				System.out.println("\t|\tVisit Again(*_*)");
				System.out.println("------------------------------------------------");
				break;
			case 2:
				System.out.println("\t|\t-----Your Order-----");
				System.out.println("\t|\t" + quantity + "\t" + sand2);
				System.out.println("\t|\tYour Total Bill is:  " + choice);
				System.out.println("\t|\tThank You for Ordering from Disha's Place");
				System.out.println("\t|\tVisit Again(*_*)");
				System.out.println("------------------------------------------------");
				break;
			case 3:
				System.out.println("\t|\t-----Your Order-----");
				System.out.println("\t|\t" + quantity + "\t" + sand3);
				System.out.println("\t|\tYour Total Bill is:  " + choice);
				System.out.println("\t|\tThank You for Ordering from Disha's Place");
				System.out.println("\t|\tVisit Again(*_*)");
				System.out.println("------------------------------------------------");
				break;
			default:
				System.out.println("Wrong Choice!!");
			}

		}
	}

	public void bevMenu() {
		System.out.println("\t\t#BEVERAGES-");
		System.out.println("\t\t1. " + bev1 + " Rs.70");
		System.out.println("\t\t2. " + bev2 + " Rs.70");
		System.out.println("\t\t3. " + bev3 + " Rs.184");
		System.out.println("\t\t4. " + bev4 + " Rs.151");
		System.out.println("Please Select Your Beverage:");
		pchoice1 = s.nextInt();

		if (pchoice1 >= 1 && pchoice1 <= 4) {
			System.out.println("Enter Quantity:");
			quantity = s.nextInt();
			switch (pchoice1) {
			case 1:
				choice = 70 * quantity;
				break;
			case 2:
				choice = 70 * quantity;
				break;
			case 3:
				choice = 184 * quantity;
				break;
			case 4:
				choice = 151 * quantity;
				break;
			default:
				System.out.println("Wrong Choice!!");
			}

			switch (pchoice1) {
			case 1:
				System.out.println("\t|\t-----Your Order-----");
				System.out.println("\t|\t" + quantity + "\t" + bev1);
				System.out.println("\t|\tYour Total Bill is:  " + choice);
				System.out.println("\t|\tThank You for Ordering from Disha's Place");
				System.out.println("\t|\tVisit Again(*_*)");
				System.out.println("------------------------------------------------");
				break;
			case 2:
				System.out.println("\t|\t-----Your Order-----");
				System.out.println("\t|\t" + quantity + "\t" + bev2);
				System.out.println("\t|\tYour Total Bill is:  " + choice);
				System.out.println("\t|\tThank You for Ordering from Disha's Place");
				System.out.println("\t|\tVisit Again(*_*)");
				System.out.println("------------------------------------------------");
				break;
			case 3:
				System.out.println("\t|\t-----Your Order-----");
				System.out.println("\t|\t" + quantity + "\t" + bev3);
				System.out.println("\t|\tYour Total Bill is:  " + choice);
				System.out.println("\t|\tThank You for Ordering from Disha's Place");
				System.out.println("\t|\tVisit Again(*_*)");
				System.out.println("------------------------------------------------");
				break;
			case 4:
				System.out.println("\t|\t-----Your Order-----");
				System.out.println("\t|\t" + quantity + "\t" + bev4);
				System.out.println("\t|\tYour Total Bill is:  " + choice);
				System.out.println("\t|\tThank You for Ordering from Disha's Place");
				System.out.println("\t|\tVisit Again(*_*)");
				System.out.println("------------------------------------------------");
				break;
			default:
				System.out.println("Wrong Choice!!");

			}
		}
	}

	public void desMenu() {
		System.out.println("\t\t#DESSERT-");
		System.out.println("\t\t1. " + des1 + " Rs.110");
		System.out.println("\t\t2. " + des2 + " Rs.90");
		System.out.println("\t\t3. " + des3 + " Rs.60");
		System.out.println("Please Select Your Dessert:");
		pchoice1 = s.nextInt();

		if (pchoice1 >= 1 && pchoice1 <= 3) {
			System.out.println("Enter Quantity:");
			quantity = s.nextInt();
			switch (pchoice1) {
			case 1:
				choice = 110 * quantity;
				break;
			case 2:
				choice = 90 * quantity;
				break;
			case 3:
				choice = 60 * quantity;
				break;
			default:
				System.out.println("Wrong Choice!!");
			}

			switch (pchoice1) {
			case 1:
				System.out.println("\t|\t-----Your Order-----");
				System.out.println("\t|\t" + quantity + "\t" + des1);
				System.out.println("\t|\tYour Total Bill is:  " + choice);
				System.out.println("\t|\tThank You for Ordering from Disha's Place");
				System.out.println("\t|\tVisit Again(*_*)");
				System.out.println("------------------------------------------------");
				break;
			case 2:
				System.out.println("\t|\t-----Your Order-----");
				System.out.println("\t|\t" + quantity + "\t" + des2);
				System.out.println("\t|\tYour Total Bill is:  " + choice);
				System.out.println("\t|\tThank You for Ordering from Disha's Place");
				System.out.println("\t|\tVisit Again(*_*)");
				System.out.println("------------------------------------------------");
				break;
			case 3:
				System.out.println("\t|\t-----Your Order-----");
				System.out.println("\t|\t" + quantity + "\t" + des3);
				System.out.println("\t|\tYour Total Bill is:  " + choice);
				System.out.println("\t|\tThank You for Ordering from Disha's Place");
				System.out.println("\t|\tVisit Again(*_*)");
				System.out.println("------------------------------------------------");
				break;
			default:
				System.out.println("Wrong Choice!!");
			}
		}
	}

	public void display() {

		System.out.println("----------Welcome to Disha's Place----------");

		System.out.println("\nPlease Enter Your Name:");
		name = s.next();

		System.out.println("--------------------------------------------");

		System.out.println("Hello " + name + " !!!");
		System.out.println("What would you like to order?");

		System.out.println("--------------------------------------------");
		System.out.println("\t|\t       \t\t|");
		System.out.println("\t|\tMenu:\t\t|");
		System.out.println("\t|\t1.Pizzas\t|");
		System.out.println("\t|\t2.Burgers\t|");
		System.out.println("\t|\t3.Sandwich\t|");
		System.out.println("\t|\t4.Beverages\t|");
		System.out.println("\t|\t5.Dessert\t|");
		System.out.println("--------------------------------------------");
	}

	public static void main(String[] args) throws Exception {
		int i = 1;

		Food f = new Food();

		f.display();

		System.out.println("Please Enter your Choice:");
		choice = s.nextInt();
		switch (choice) {
		case 1:
			f.pizzaMenu();
			break;
		case 2:
			f.burgerMenu();
			break;
		case 3:
			f.sandwichMenu();
			break;
		case 4:
			f.bevMenu();
			break;
		case 5:
			f.desMenu();
			break;
		default:
			System.out.println("Please Enter Correct Choice...");
		}

		while (i <= 6) {
			System.out.println("Would you like to Order again? Y/N:");
			again = s.next();
			if (again.equalsIgnoreCase("y")) {
				f.display();
				System.out.println("Please Enter your Choice:");
				choice = s.nextInt();
				switch (choice) {
				case 1:
					f.pizzaMenu();
					break;
				case 2:
					f.burgerMenu();
					break;
				case 3:
					f.sandwichMenu();
					break;
				case 4:
					f.bevMenu();
					break;
				case 5:
					f.desMenu();
					break;
				}

			} else {
				System.out.println("Thank You...Visit Again(*_*)!!!");
				System.out.println("------------------------------------------------");
			}
		}

		// while (again == "n" || again == "N");

		s.close();
	}

}
