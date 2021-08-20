package Inher_2;

public class Text_File extends Vehical_Logo
{

	public void edt_txt()
	{
		System.out.println("Txt File editing");
	}
	
	
	public static void main(String[] args) 
	{

		Text_File tx = new Text_File();
		tx.edt_txt();
		tx.display_logo();
		
	}

}
