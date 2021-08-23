package Abstraction_ex;

public class WhatsApp_V2 extends WhatsApp_V1
{


	@Override
	public void status_Video()
	{
		System.out.println("Video Status");
		
	}

	
	@Override
	public void status_gif(int a, int b)
	{
		System.out.println("Gif Status");
		
	}


	
	public static void main(String[] args)
	{
		WhatsApp_V2 v2 = new WhatsApp_V2();
		
		v2.status_text();
		v2.status_Photo();
		v2.status_Video();
		v2.status_gif(3, 5);

	}


	

}
