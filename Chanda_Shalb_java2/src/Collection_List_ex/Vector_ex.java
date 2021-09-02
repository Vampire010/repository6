package Collection_List_ex;

import java.util.Vector;

public class Vector_ex 
{

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
		
		Vector<Integer> num = new Vector<>();
		num.addAll(evnnum);
		System.out.println("evnnum Added to NUm : " + num);

		num.addAll(oddnum);
		System.out.println("oddnum Added to NUm : " + num);

	}

}
