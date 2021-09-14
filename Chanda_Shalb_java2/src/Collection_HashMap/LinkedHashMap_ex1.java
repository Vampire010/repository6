package Collection_HashMap;

import java.util.LinkedHashMap;

public class LinkedHashMap_ex1 {

	public static void main(String[] args) 
	{
		// Creating a LinkedHashMap of even numbers
		LinkedHashMap<String, Integer> evenNumbers = new LinkedHashMap<>();
		evenNumbers.put("Two", 2);
		evenNumbers.put("Four", 4);
		System.out.println("LinkedHashMap1: " + evenNumbers);
	
		// Creating a LinkedHashMap from other LinkedHashMap
		LinkedHashMap<String, Integer> numbers = new LinkedHashMap<>(evenNumbers);
		numbers.put("Three", 3);
		System.out.println("LinkedHashMap2: " + numbers);
		
		
		LinkedHashMap<String, Integer> whole_numbers = new LinkedHashMap<>();
		whole_numbers.putAll(numbers);
		System.out.println("LinkedHashMap2: " + whole_numbers);
		// Using putIfAbsent()
		whole_numbers.putIfAbsent("Six_1", 7);
		System.out.println("Updated LinkedHashMap(): " + whole_numbers);
		
		// Using getOrDefault()
		int value2 = whole_numbers.getOrDefault("Five", 5);
		System.out.println("Returned Number: " + value2);
		
		
		// remove method with two parameters
		boolean result = numbers.remove("Three", 3);
		System.out.println("Is the entry Three removed? " + result);
		System.out.println("Updated LinkedHashMap: " + numbers);
		
	}

}
