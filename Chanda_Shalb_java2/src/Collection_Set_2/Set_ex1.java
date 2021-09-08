package Collection_Set_2;

import java.util.TreeSet;

public class Set_ex1 {

	public static void main(String[] args)
	{
		// Creating a tree set with customized comparator
        TreeSet<String> animals = new TreeSet<>(new CustomComparator());

        animals.add("Dog");
        animals.add("Zebra");
        animals.add("Cat");
        animals.add("Horse");
        
        System.out.println("TreeSet: " + animals);

	}

}
