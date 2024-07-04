import java.util.*;
public class Practice{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter digit 1: ");
	double digit1 = input.nextDouble();

	System.out.print("Enter digit 2: ");
	double digit2 = input.nextDouble();

	System.out.print("Enter digit 3: ");
	double digit3 = input.nextDouble();

 
	
	double Division = digit1 / digit2 / digit3;
	double Average = Division / 3;
	double sum = Division + Average;

	System.out.printf("Total average = %f%n", Average);
	System.out.printf("Total division = %f%n", Division);
	System.out.printf("Total sum = %f", sum);
	}

}