package Exception_Handling;

public class Throw_Ex 
{
	
	public static void divideByZero() 
	{
		throw new NullPointerException("It's Admin Exception");	
	}
	
	public void add() 
	{
		divideByZero();

		System.out.print("Im Add");
		
	}
	
		
	public static void main(String[] args) throws Exception 
	{
		Throw_Ex t = new Throw_Ex();
		t.add();
		
	}
	
}
