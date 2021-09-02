package Collection_List_ex;

import java.util.Vector;

public class Vector_Rmal_Clr {

	public static void main(String[] args) 
	{
		Vector<Integer> evnnum = new Vector<>();
		evnnum.add(2);
		evnnum.add(4);
		evnnum.add(6);
		System.out.println(evnnum);
		
		Vector<Integer> oddnum = new Vector<>();
		oddnum.add(1);
		oddnum.add(3);
		oddnum.add(5);
		System.out.println(oddnum);
		
		//removeAll 
		evnnum.removeAll(evnnum);
		System.out.println(evnnum);

		//clear 
		oddnum.clear();
		System.out.println(oddnum);
		
		//isEmpty
		boolean bool=  evnnum.isEmpty();
		System.out.println(bool);

		//isEmpty
		boolean bool1=  oddnum.isEmpty();
		System.out.println(bool1);

		
	}

}
