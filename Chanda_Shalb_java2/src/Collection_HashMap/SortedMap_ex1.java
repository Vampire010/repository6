package Collection_HashMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMap_ex1 {

	public static void main(String[] args) 
	{
		// Creating SortedMap using TreeMap
		SortedMap<String, Integer> numbers = new TreeMap<>();
		// Insert elements to map
		numbers.put("Two", 2);
		numbers.put("One", 1);
		numbers.put("nine", 9);
		numbers.put("Five", 5);
		numbers.put("six", 6);
		numbers.put("Eight", 8);
		numbers.put("Eleven", 11);

		System.out.println("SortedMap: " + numbers);

		// Access the first key of the map
		System.out.println("First Key: " + numbers.firstKey());
		
		// Access the last key of the map
		System.out.println("Last Key: " + numbers.lastKey());
		
		System.out.println("headMap Key: " + numbers.headMap("One"));
		
		System.out.println("tailMap Key: " + numbers.tailMap("One"));

		
	}

}
