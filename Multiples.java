import java.util.*;
public class Multiples{
	public static void main(String[] args){

	Scanner input;
	input = new Scanner(System.in);

	System.out.print("num1: ");
	int number1 = input.nextInt();

	System.out.print("num2: ");
	int number2 = input.nextInt();

	System.out.print("num3: ");
	int number3 = input.nextInt();

	int sum = number1 + number2 + number3;
	int substraction = number1 - number2 - number3;

	System.out.println("sum = " + sum);
	System.out.println("substraction = " + substraction);
	}

}
	

