package Collection_Queue_ex;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueue_ex1 {

	public static void main(String[] args) throws InterruptedException 
	{
		ArrayBlockingQueue<String> animals = new ArrayBlockingQueue<>(5);
		
			// Add elements to animals
			animals.put("Dog");
			animals.put("Cat");
			System.out.println("ArrayBlockingQueue: " + animals);
			
			// Remove an element
			String element = animals.take();
			System.out.println("Removed Element: " + element);
			
			String element1 = animals.take();
			System.out.println("Removed Element: " + element1);
			
			String element2 = animals.take();
			System.out.println("Removed Element: " + element2);
			
			System.out.println("******");

			animals.put("Horse");	
			
	}

}

