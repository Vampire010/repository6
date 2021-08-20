package Array_ex;

import java.util.Scanner;

public class Array_3 

{

	public static void main(String[] args)
	{

		Scanner sc= new Scanner(System.in);
	
		System.out.println("****____Enter the Size of an Array___**** ");

		int size = sc.nextInt();
		
		int[] numbers = new int[size] ;
		
		System.out.println("****____Enter the  Array Elements___**** ");

		for(int i=0;i<numbers.length;i++ )
		{
			
			numbers[i]=sc.nextInt();	

		}	
		
		for(int i=0;i<numbers.length;i++ )
		{
			//System.out.print(numbers[i] + " , ");
			
		}

	}

}
