package File_Handling;

import java.io.File;

public class Create_File {

	public static void main(String[] args) 
	{
		File fl = new File("/Users/girishg/eclipse-workspace/Chandan_Shalb/src/Text_Files/Girish2.txt");
		
		try
		{
			if(fl.createNewFile())
			{
				System.out.println("File is Created");
			}
			else
			{
				System.out.println("File already Exists " +fl.getName());
				
			}
		}
		
		catch(Exception E)
		{
			System.out.println(E);

		}
	}

}
