package Condition_Statements;

import java.util.Scanner;

public class Perc_ex
{

	public static void main(String[] args) 
	{
		  float percentage;
	      float total_marks;
	      float Obatined_scored;		
		
	      

	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter your Obatined_score ::");
	      Obatined_scored = sc.nextFloat();

	      System.out.println("Enter total_marks ::");
	      total_marks = sc.nextFloat();

		
		
		if(Obatined_scored>=600 && Obatined_scored<=700)
		{
			
			percentage = (float)((Obatined_scored / total_marks) * 100);
		    System.out.println("Percentage ::"+ percentage);
		      
			System.out.print(" - A Grade ");
		}
		
		else if(Obatined_scored>=500 && Obatined_scored<600)
		{

			System.out.print(" -  B Grade ");
		}
		
		else if(Obatined_scored>=400 && Obatined_scored<500)
		{

			System.out.print(" - C Grade ");
		}
		
		else if(Obatined_scored>=300 && Obatined_scored<400)
		{

			System.out.println(" - D Grade");
		}
		else if(Obatined_scored>=0 && Obatined_scored<=34)
		{

			System.out.println("Try Again");
		}
		else
		{
			System.out.println("Enterd the Valid Number");
		}
		
	}

}
