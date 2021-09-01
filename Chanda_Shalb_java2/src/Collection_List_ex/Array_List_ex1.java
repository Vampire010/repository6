package Collection_List_ex;

import java.util.ArrayList;

public class Array_List_ex1 
{

	public static void main(String[] args)
	{
		ArrayList<Integer> arl = new ArrayList<Integer>();
		
		
		arl.add(200);
		arl.add(400);
		arl.add(300);
		arl.add(100);
		arl.add(600);
		arl.add(600);

		System.out.println(arl);
		
		//Insert the value 
		arl.add(0,80);
		System.out.println(arl);

		// get the element from the arraylist
		int str = arl.get(5);
		
		System.out.println("Element at index 5 : " + str);
		
		// change the element of the array list
		arl.set(0,90 );
		System.out.println("Modified ArrayList: " + arl);

	}

}
