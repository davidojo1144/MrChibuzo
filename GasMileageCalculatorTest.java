import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class GasMileageCalculatorTest{ 

	@Test
	public void testCanCalculateaMilesPerGallon(){

	//given
	GasMileageCalculator calculator = new GasMileageCalculator();
	//when
	double numberOfMilesDriven = 30.00;
	double numberOfGallons = 20;
	double milesPerGallon = calculator.computeMilesPerGallon(numberOfMilesDriven, numberOfGallons);
	//assert
	assertEquals(1.5, milesPerGallon);

	}
}


public class MultiplicationTest{
  
   	   @Test
           public void testTheCalculatorCanMultiply(){

            //given
            Multiplication multiplication = new Multiplication();
      
            //when
            int result = multiplication.multiply(2, 5);
            //assert
            assertEquals(10, result);


  }

}
  
  	

	