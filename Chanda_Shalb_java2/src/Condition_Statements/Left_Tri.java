package Condition_Statements;

public class Left_Tri 
{

	public static void main(String[] args) 
	{
			
		int i,j;
		for( i =0 ; i<=5 ; i++)
		{
			
			for(j=2*(5-i);j>0;j--)
			{
				System.out.print(" ");

			}
			
	
			
			for(j=0;j<=i ;j++)
			{
				System.out.print("* ");
				
			}
			System.out.println();

			
			
		}
		
		
	}

}
/*
 
  1 2 3 4 5
1         *
2       * *
3     * * *
4   * * * *
5 * * * * *

*/






