package Collection_Set;

import java.util.HashSet;

public class HashSet_Subset {

	public static void main(String[] args) 
	{
		HashSet<Integer> numbers = new HashSet<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		System.out.println("HashSet1: " + numbers);
		
		HashSet<Integer> primeNumbers = new HashSet<>();
		primeNumbers.add(1);
		primeNumbers.add(5);
		primeNumbers.add(4);

		System.out.println("HashSet2: " + primeNumbers);
		
		// Check if primeNumbers is a subset of numbers
		boolean result = numbers.containsAll(primeNumbers);
		
		System.out.println("Is primeNumbers is subset of numbers? " + result);
		
		boolean result1 = numbers.contains(4);
		
		System.out.println(" is Element Prasent " + result1);
	}

}
