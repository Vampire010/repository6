package Collection_HashMap;

import java.util.TreeMap;

public class SortedMap_ex2 
{
	public static void main(String[] args)
	{
		TreeMap<String, Integer> numbers = new TreeMap<>();
		numbers.put("Two", 2);
		numbers.put("One", 1);
		numbers.put("nine", 9);
		numbers.put("Five", 5);
		numbers.put("six", 6);
		numbers.put("Eight", 8);
		numbers.put("Eleven", 11);
		
		
		System.out.println("TreeMap: " + numbers);
		
		System.out.println("\nUsing subMap() Method:");
		// Using subMap() with default booleanValue
		System.out.println("Without boolean value: " + numbers.subMap("Eight", "One"));
		// Using subMap() with specified booleanValue
		System.out.println("With boolean value: " + numbers.subMap("Eight", false, "One", true));
		
		}

}
