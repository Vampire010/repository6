package File_Handling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Read_Char_data {

	public static void main(String[] args) 
	{
		int n = 4; // The line number
	      String line;
	      
	      try ( Stream<String> lines = Files.lines(Paths.get("/Users/girishg/eclipse-workspace/Chandan_Shalb/src/Text_Files/Girish.txt")))
	      {
		        line = lines.skip(n).findFirst().get();
		        System.out.println(line);
	     
	      }
	      catch(IOException e)
	      {
	        System.out.println(e);
	      }
	}

}
