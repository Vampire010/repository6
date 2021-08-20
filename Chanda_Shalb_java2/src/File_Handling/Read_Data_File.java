package File_Handling;

import java.io.File;
import java.util.Scanner;

public class Read_Data_File {

	public static void main(String[] args) 
	{

		try
		{
		File fl = new File("/Users/girishg/eclipse-workspace/Chandan_Shalb/src/Text_Files/Girish.txt");
		
		Scanner mr = new Scanner(fl);
		
		while(mr.hasNextLine())
		{
			String data = mr.nextLine();
			
			System.out.println(data);
						
		}
		mr.close();
		
		}
		catch(Exception E)
		{
			System.out.println(E);

		}
		
	}

}
