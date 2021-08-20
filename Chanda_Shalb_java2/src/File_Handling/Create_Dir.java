package File_Handling;

import java.io.File;

public class Create_Dir {

	public static void main(String[] args) 
	{

		File fl = new File("/Users/girishg/eclipse-workspace/Chandan_Shalb/src/Text_Files");
		
		if(fl.mkdir())
		{
			System.out.println("Directory is Created");
		}
		else
		{
			System.out.println("Directory already Exists " +fl.getName());
			
		}
		
		
		
	}

}
