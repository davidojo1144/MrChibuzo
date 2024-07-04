import java.util.*;
	public class MyOwn{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter number: ");
	 int number1 = input.nextInt();

	System.out.print("Enter number: ");
	int number2 = input.nextInt();

	System.out.print("Enter number: ");
	int number3 = input.nextInt();


	int sum = number1 + number2 + number3;
	int average = sum / 3;
	

	System.out.println("The total sum = " + sum); 
	System.out.println("The total average = " + average);

	}
 

}