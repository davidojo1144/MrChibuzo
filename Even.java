import java.util.Scanner;
public class Even{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int number = input.nextInt();

	for (int even = 2; even <= number; even+=2){
	 System.out.println("The even number is:"  +  even); 

	}

	}

}

