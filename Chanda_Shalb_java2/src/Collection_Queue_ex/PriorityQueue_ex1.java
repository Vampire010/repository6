package Collection_Queue_ex;

import java.util.PriorityQueue;

public class PriorityQueue_ex1 {

	public static void main(String[] args) 
	{
		// Creating a priority queue
		PriorityQueue<Integer> numbers = new PriorityQueue<>();
		// Using the add() method
		numbers.add(4);
		numbers.add(2);
		numbers.add(5);
		numbers.add(7);
		numbers.add(3);
		numbers.add(10);

		System.out.println("PriorityQueue: " + numbers);
		
		// Using the offer() method
		numbers.offer(1);
		System.out.println("Updated PriorityQueue: " + numbers);
	}

}

 
  	  
		  
