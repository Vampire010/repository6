package Collection_Set;

import java.util.HashSet;

public class HashSet_ex1 {

	public static void main(String[] args) 
	{
		HashSet<Integer> evenNumber = new HashSet<>(5,80);
		evenNumber.add(1);
		evenNumber.add(2);
		evenNumber.add(3);
		evenNumber.add(4);
		evenNumber.add(5);
		evenNumber.add(6);
		evenNumber.add(7);
		System.out.println(evenNumber);
		
		HashSet<Integer> num = new HashSet<>();
		num.addAll(evenNumber);
		System.out.println(num);

		
		
	}

}
