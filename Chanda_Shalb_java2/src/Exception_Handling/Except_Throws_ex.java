package Exception_Handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Except_Throws_ex 
{
	
	public static void findFile() throws FileNotFoundException ,NullPointerException,IOException
	{
		// code that may produce IOException
		File newFile = new File("test.txt");
		
		FileInputStream stream = new FileInputStream(newFile);
	
	}
	
	
	

	public static void main(String[] args) throws NullPointerException, IOException 
	{
		Except_Throws_ex.findFile();
	}

}
