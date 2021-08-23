package PolyMorphism_Ex;

public class Facebook_Status
{
	
	//Text - String
	//Photo - Int
	//Video - double
	//Gif1 - Int , double
	//Gif2 - String , Int
	
	
	
	public void fb_status(String Name)
	{
		System.out.println("Ststus Uploaded as Text");
		
	}

	public void fb_status(int num)
	{
		System.out.println("Ststus Uploaded as Photo");
		
	}
	
	public void fb_status(double num)
	{
		System.out.println("Ststus Uploaded as Video");
		
	}
	
	
	public void fb_status(int num, double num2)
	{
		System.out.println("Ststus Uploaded as Photo");
		
	}
	
	public void fb_status(String Name, int num)
	{
		System.out.println("Ststus Uploaded as Photo");
		
	}
	
	

	public static void main(String[] args) 
	{

		Facebook_Status fb = new Facebook_Status();
		
		fb.fb_status("kwjefbwj");
		fb.fb_status(4537);

		
		
		
		
				
		
		
	}

}
