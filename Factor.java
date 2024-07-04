import java.util.Scanner;
public class Factor{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int number = input.nextInt();

	int numberOfFactor = 0;
	
	for (int counter = 2; counter <= number; counter++){

	if (number % counter == 0){
	numberOfFactor++;
	
	}

	}

	System.out.print("The number of factor is: " + numberOfFactor);

	}

}