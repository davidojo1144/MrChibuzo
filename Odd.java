import java.util.Scanner;
public class Odd{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int number = input.nextInt();

	for (int odd = 1; odd <= number; odd+=2){
	 System.out.println("The odd number is:"  +  odd); 

	}

	}

}

