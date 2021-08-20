package Practice;

import java.util.Scanner;

public class Reverse_num 
{

	public static void main(String[] args)
	{
	
		int num; //1234
		int rev =0;
		
	    Scanner input = new Scanner(System.in);
	    
	    System.out.println("Enter the num");
	    
	    num= input.nextInt();
	    
	    
	    while(num!=0)
	    {
	    	int digit = num%10;
		    System.out.println(" dgt " +digit);

	    	
	    	rev = rev*10+digit;
	    	
		    System.out.println(" rev " +rev);

	    	
	    	
	    	num/=10;	
	    }
	
	    System.out.println(rev);

		
	}

}
