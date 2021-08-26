package Constructor_Ex;

public class Display 
{
	
	public Display()
	{
		
		System.out.println("No Data is Recived");
		
	}
	
	
	public Display(int a)
	{
		
		System.out.println("Integer Data is Recived");
		
	}
	
	
	public Display(String name)
	{
		
		System.out.println("String Data is Recived");
		
	}
	

	public void zoo()
	{
		
		System.out.println("Zoooooooo");

		
		
	}
	
	
	
	public static void main(String[] args) 
	{

		
		Display dp = new Display();
		
		Display dpint = new Display(897);

		Display dpstrng = new Display("fjhvfjsefwvVD");

		
		
	}

}
