package Collection_Set_2;

import java.util.TreeSet;

public class TreeSet_SubSet_ex {

	public static void main(String[] args) 
	{
		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(2);
		numbers.add(5);
		numbers.add(4);
		numbers.add(6);
		System.out.println("TreeSet: " + numbers);
	
		// Using subSet() with default boolean value
		System.out.println("Using subSet without boolean value: " + numbers.subSet(2, 6));
		
		// Using subSet() with specified boolean value
		System.out.println("Using subSet with boolean value: " + numbers.subSet(2, true, 6, true));
	}

}
