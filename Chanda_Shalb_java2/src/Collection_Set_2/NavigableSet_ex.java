package Collection_Set_2;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSet_ex {

	public static void main(String[] args) {
		// Creating NavigableSet using the TreeSet
        NavigableSet<Integer> numbers = new TreeSet<>();

        // Insert elements to the set
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("NavigableSet: " + numbers);
        
        System.out.println("descending NavigableSet: " + numbers.descendingSet());
        System.out.println("descending NavigableSet: " + numbers.descendingIterator());

        

	}

}
