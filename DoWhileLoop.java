import java.util.*;
public class DoWhileLoop{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter num: ");
	int num = input.nextInt();
	int total = 1;

	do{
	System.out.println("num: " + num);
	num++;

	}
	while(num <= 10);
	total = total + num;
	System.out.println("total: " + total);




	}

}

	
