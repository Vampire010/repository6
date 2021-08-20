package Practice;

import java.util.Scanner;

public class Leap_Year_Ex {

	public static void main(String[] args) 
	{

		int Year;
		//boolean leap=false; 
		
        // creates an object of Scanner class
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the Year");
        
        Year= input.nextInt();
        
        while(Year%4 ==0 )
        {
        	
            System.out.println("its leap year");

        	break;
        }
        
        System.out.println("its not a leap year");

	}

}
