package Collection_Set;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedHashSet_ex1 
{

	public static void main(String[]args)
	{
		LinkedHashSet<Integer> evenNumber = new LinkedHashSet<>();
		// Using add() method
		evenNumber.add(2);
		evenNumber.add(4);
		evenNumber.add(6);
		System.out.println("LinkedHashSet: " + evenNumber);
	
		ArrayList<Integer> Numbers = new ArrayList<>(evenNumber);
		Numbers.add(1);
		Numbers.add(3);
		System.out.println("ArrayList: " + Numbers);
			
	}

}
