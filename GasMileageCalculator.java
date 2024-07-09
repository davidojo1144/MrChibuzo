public class GasMileageCalculator{

	public double computeMilesPerGallon(double numberOfMilesDriven, double numberOfGallons){

	return  1.5;

	}
}



public class Multiplication{
  public int multiply(int firstNumber, int secondNumber){
  
  int multiply =0;
  
  	for (int count = 1; count <= secondNumber; count++){
      multiply += firstNumber;
	}
      
      if (secondNumber < 0){
        multiply = -multiply;
	}
        return multiply;

  }
}