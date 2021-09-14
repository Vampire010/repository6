package Collection_Queue_ex;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque_ex1 {

	public static void main(String[] args) 
	{
		 // Creating Deque using the ArrayDeque class
        Deque<Integer> numbers = new ArrayDeque<>();

        // add elements to the Deque
        numbers.offer(1);
       
        numbers.offer(4);
        numbers.offer(10);
        numbers.offer(19);

        numbers.offerLast(2);
        numbers.offerFirst(3);
        
        numbers.addFirst(24);
        numbers.addLast(100);


        System.out.println("Deque: " + numbers);

        // Access elements of the Deque
        int firstElement = numbers.peekFirst();
        System.out.println("First Element: " + firstElement);

        int lastElement = numbers.peekLast();
        System.out.println("Last Element: " + lastElement);

        // Remove elements from the Deque
        int removedNumber1 = numbers.pollFirst();
        System.out.println("Removed First Element: " + removedNumber1);

        int removedNumber2 = numbers.pollLast();
        System.out.println("Removed Last Element: " + removedNumber2);

        System.out.println("Updated Deque: " + numbers);
	}

}