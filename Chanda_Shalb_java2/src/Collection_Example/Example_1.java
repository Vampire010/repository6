package Collection_Example;

import java.awt.List;

import java.util.ArrayList;

public class Example_1 
{

	public static void main(String[] args)
	{
		
			ArrayList animals = new ArrayList();
			
			// Add elements
			animals.add("Dog");
			animals.add("Cat");
			animals.add("Horse");
			
			animals.add('A');
			
			animals.add(123);
			
			animals.add(645.888);
			
			
			System.out.println("ArrayList: " + animals);

			
			animals.remove(0);


		
			System.out.println("ArrayList: " + animals);
			
			
			
			}
	

}
