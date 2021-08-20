package File_Handling;

import java.io.File;

public class Delete_File {

	public static void main(String[] args) 
	{
		File myObj = new File("/Users/girishg/eclipse-workspace/Chandan_Shalb/src/Text_Files/Girish2.txt");
		
		if (myObj.delete())
		{
			System.out.println("Deleted the file: " + myObj.getName());
		} 
		
		else 
		{
			System.out.println("Failed to delete the file.");
		}
	}

}
