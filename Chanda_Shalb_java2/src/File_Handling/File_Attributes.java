package File_Handling;

import java.io.File;

public class File_Attributes {

	public static void main(String[] args) 
	{
		File fl = new File("/Users/girishg/eclipse-workspace/Chandan_Shalb/src/Text_Files/Girish.txt");
		if (fl.exists()) 
		{
			System.out.println("File name: " + fl.getName());
			System.out.println("Absolute path: " + fl.getAbsolutePath());
			System.out.println("Writeable: " + fl.canWrite());
			System.out.println("Readable " + fl.canRead());
			System.out.println("File size in bytes " + fl.length());

		} 
		
		else
		
		{
			System.out.println("The file does not exist.");
		}

	}

}
