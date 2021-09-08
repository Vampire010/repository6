package Collection_Set_2;

import java.util.Iterator;
import java.util.TreeSet;

public class Desneding_Itr {

	public static void main(String[] args)
	{
		TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        numbers.add(4);
        numbers.add(10);


        System.out.println("descending Set: " + numbers.descendingSet());

        // Calling iterator() method
        Iterator<Integer> iterate = numbers.descendingIterator();
        System.out.print("Treeset using descendingIterator: ");
       
        // Accessing elements
        while(iterate.hasNext())
        {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
	}

}
