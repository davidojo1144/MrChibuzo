import java.util.Scanner;
public class Menu{
public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	int menu;
	int satisfied;

	System.out.println("Welcome to Dave's food city.");
	System.out.println("Sit and feel relaxed while you order your meal.");


	System.out.println("Menu for all.");
	System.out.println("1. for tacos.");
	System.out.println("2. for soft drink.");
	System.out.println("3. for take away.");
	System.out.println("choose between 1 - 3 what you'd like to have: ");
	 menu = sc.nextInt();

	switch(menu){
		case 1: System.out.println(":tacos");
		break;

		case 2: System.out.println(":soft drink");
		break;

		case 3: System.out.println(":take away");
		break;

		default: System.out.println("Not available on the menu!");
		break;
		}

		
	System.out.println("We'd love to know if you are satisfied with your order: ");
	System.out.println("1. Yes i am.");
	System.out.println("2. no!");
	System.out.println("choose between 1 and 2 what you feel like: ");
	satisfied = sc.nextInt();

	switch(satisfied){
			case 1: System.out.println("Yes i am");
				break;

			case 2: System.out.println("No! i am not satisfied");
				break;

			default: System.out.println("We are so sorry");
				System.out.println("Thanks for coming");
				break;
			}

		}


			
	}

