package Inher_2;

public class Image_Edit extends Vehical_Logo
{
	public void img_edit()
	{
		
		System.out.println("Image_Editing");
		
	}
	
	private void img_edit1()
	{
		
		System.out.println("Private Image_Editing");
		
	}

	public static void main(String[] args)
	{
		Image_Edit lg = new Image_Edit();
		
		lg.img_edit();
		lg.display_logo();
		lg.img_edit1();
		
		

	}

}
