package Exception_Handling;

public class Ex1 
{

	public void demo()
	{
		

		int[] num = new int[3];
		
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;

		System.out.println(num[1]);
		
		try
		{
			System.out.println(num[5]);
		}
		
		catch(Exception e)
		{
			System.out.println( " Thanks i can Handle  " + e );
	
		}

		System.out.println(num[2]);
		System.out.println(num[0]);
		
	}
	
	
	
	
	
	public static void main(String[] args) 
	{
		Ex1 wx = new Ex1();
		
		wx.demo();
				

	}

}
