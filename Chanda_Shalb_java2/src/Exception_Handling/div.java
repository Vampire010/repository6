package Exception_Handling;

public class div 
{

	public static void main(String[] args) 
	{

		int[] num = new int[3];
				
				num[0] = 10;
				num[1] = 20;
				num[2] = 30;

		
		
		
				
				try
				{
					System.out.println(num[1]);

					
					int a = 10/2;
					System.out.println(a);
				}
				
				catch(ArithmeticException e)
				{
					System.out.println( " Thanks i can Handle  " + e );
			
				}
				
				catch(ArrayIndexOutOfBoundsException e1)
				{
					System.out.println( " Thanks i can Handle  " + e1 );
			
				}
				
				finally
				{
					System.out.println( " Thanks im finally  " );

				}
				
		
		
	}

}
