package Condition_Statements;

import java.util.Scanner;

public class Grading_Ex1 
{

	public double calculatePercentage(double obtained, double total) 
	{
        return obtained * 100 / total;
    }
	
	public static void main(String[] args)
	{
		PercentageCalculator pc = new PercentageCalculator();

		Scanner sc= new Scanner(System.in);
		System.out.print(" Eneter the marks");
		
		
		double a = sc.nextDouble();
		
		if(a>=600 && a<=700)
		{
			System.out.print(" Percentage is: " + pc.calculatePercentage(a, 700));
			
			System.out.print(" - A Grade ");
		}
		else if(a>=500 && a<600)
		{
			System.out.print(" Percentage is: " + pc.calculatePercentage(a, 700));

			System.out.print(" -  B Grade ");
		}
		
		else if(a>=400 && a<500)
		{
			System.out.print(" Percentage is: " + pc.calculatePercentage(a, 700));

			System.out.print(" - C Grade ");
		}
		
		else if(a>=300 && a<400)
		{
			System.out.print(" Percentage is: " + pc.calculatePercentage(a, 700));

			System.out.println(" - D Grade");
		}
		else if(a>=0 && a<=34)
		{
			System.out.print(" Percentage is: " + pc.calculatePercentage(a, 700));

			System.out.println("Try Again");
		}
		else
		{
			System.out.println("Enterd the Valid Number");
		}
		
		
	}

}




























