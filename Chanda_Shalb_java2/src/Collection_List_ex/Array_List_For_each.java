package Collection_List_ex;

import java.util.ArrayList;

public class Array_List_For_each
{

	public static void main(String[] args) 
	{
		// creating an array list
		ArrayList<String> animals = new ArrayList<>();
		animals.add("Cow");
		animals.add("Cat");
		animals.add("Dog");
		System.out.println("ArrayList: " + animals);
		
		// iterate using for-each loop
		System.out.println("Accessing individual elements: ");
		
		for (String animal : animals) 
		{
			System.out.print( animal) ;
			System.out.print(", ");
		}
	}

}
