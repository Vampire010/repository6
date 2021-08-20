package Condition_Statements;

public class left_ex3 {

	public static void main(String[] args) 
	{

		int i,j,row =5;
		
		for(i =0 ; i<row;i++)
		{
			
			for(j=2*(row-i);j>1;j--)
			{
				System.out.print(" ");

			}
			
			for(j=0;j<=i ;j++)
			{
				System.out.print("i ");
				
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



i =0 ;

j =2*(5-0)=10

*/
