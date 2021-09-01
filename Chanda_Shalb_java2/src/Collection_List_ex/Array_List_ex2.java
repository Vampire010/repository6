package Collection_List_ex;

import java.util.ArrayList;

public class Array_List_ex2 {

	public static void main(String[] args) 
	{
		
		ArrayList<String> al1 = new ArrayList<>();
		al1.add("C");
		al1.add("Java");
		al1.add("Python");
		al1.add("C#");
		
		System.out.println(al1);
		
		String rm = al1.remove(0);
		
		System.out.println("Element Removed "+rm);

		
		System.out.println("Elements After Removing "+al1);

		
		
		
		
	}

}
