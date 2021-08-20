package Var_Data;

public class Calculator
{
	int a =10 ;
	int b =20 ;
	
	static int d = 3;
	
	public void add()
	{
		int c = a+b;
		System.out.println(c);
	}
	
	public void mul()
	{
		 int c = a*b;

		System.out.println(c);
		
	}
	
	
	public static void div()
	{
		 int c = 10000;
		System.out.println(c);
	}
	
	
	public static void main(String[] args)
	{
		//creation of object
		Calculator cal = new Calculator();
		cal.add();
		cal.mul();
		
		Calculator.div();
	}

}
