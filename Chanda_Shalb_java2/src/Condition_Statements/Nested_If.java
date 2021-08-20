package Condition_Statements;

import java.util.Scanner;

public class Nested_If {

	public static void main(String[] args)
	{
		int age;
		   Scanner sc = new Scanner(System.in);
	      System.out.println("Enter your Obatined_score ::");
	      age = sc.nextInt(); 
	      
	      
		if(age>=0 && age<45)
		{
			if(age<=18)
			{
				//System.out.println( "Vaccination for Youth and childern ");
				
				if(age<=12)
				{
					System.out.println( "Vaccination for childern ");
				}
				else if(age>12)
				{
					System.out.println( "Vaccination for Youth ");	
				}
			}
			
			else if(age>18)
			{
				System.out.println( "Vaccination for middle aged ");
				
			}
			
			
		}
		else if(age>45)
		{
			System.out.println( "Vaccination for Senior Citizen ");

		}
		
	}

}
