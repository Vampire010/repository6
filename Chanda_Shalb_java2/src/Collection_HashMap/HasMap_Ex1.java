package Collection_HashMap;

import java.util.HashMap;

public class HasMap_Ex1 {

	public static void main(String[] args) 
	{
	
		//key = Integer  = Roll_Number
		//value = String = Student_name
		
		HashMap<Integer, String> Student_data = new HashMap<>();
		
		Student_data.put(1,"john");
		Student_data.put(5,"nakul");
		Student_data.put(2,"smith");
		Student_data.put(4,"laxman");
		Student_data.put(3,"ram");
		
		System.out.println(Student_data);
		
		
		
		// get() method to get value
		String value = Student_data.get(1);
		System.out.println("Value at index 1: " + value);
		
		// return set view of keys
		// using keySet()
		System.out.println("Keys: " + Student_data.keySet());
		// return set view of values
		// using values()
		System.out.println("Values: " + Student_data.values());
		// return set view of key/value pairs
		// using entrySet()
		System.out.println("Key/Value mappings: " + Student_data.entrySet());
		
		// change element with key 2
		Student_data.replace(2, "krishna");
		System.out.println("HashMap using replace(): " + Student_data);
		
		// remove element associated with key 2
		String value3 = Student_data.remove(2);
		System.out.println("Removed value: " + value3);
		System.out.println("Updated HashMap: " + Student_data);
		
		

	}

}
