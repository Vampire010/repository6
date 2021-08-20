package Practice;

public class prime_ex
{

	public static void main(String[] args)
	{
		int num = 2;
		
		boolean flag = false;
		
		
		for(int i = 2; i<=num/2;i++) // 14.5 % 2
		{
			
			
			if(num%i==0)
			{
				
				flag = true;
				break;
				
			}
		}
		if(!flag)
		{
			System.out.print(num + " is prime");
			
		}
		
		else
		{
			System.out.print(num + " not a  prime");
			
		}
		
		
	}

}
