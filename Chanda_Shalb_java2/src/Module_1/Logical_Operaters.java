package Module_1;

public class Logical_Operaters {

	public static void main(String[] args) 
	{
		int number1 = 3, number2 = 6, number3 = 9;
	    boolean result;

		 // At least one expression needs to be true for the result to be true
		 result = (number1 > number2) || (number3 > number1);
		 
		 
		 // result will be true because (number1 > number2) is true
		 System.out.println(result);

		 // All expression must be true from result to be true
		 result = (number1 > number2) && (number3 > number1);
		 
		 
		 // result will be false because (number3 > number1) is false
		 System.out.println(result);
	}

}
