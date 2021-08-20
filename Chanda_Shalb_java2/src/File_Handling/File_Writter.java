package File_Handling;

import java.io.FileWriter;

public class File_Writter {

	public static void main(String[] args)
	{
		try 
		{
			FileWriter myWriter = new FileWriter("/Users/girishg/eclipse-workspace/Chandan_Shalb/src/Text_Files/Girish.txt");
			
			myWriter.write("Files in Java might be tricky, but it is fun enough!");
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
			
		} 
		catch (Exception e) 
		{
			System.out.println("An error occurred.");
			e.printStackTrace();
			
			}
	}

}
