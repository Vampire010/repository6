package Constructor_Ex;

public class Hotel 
{

	
	public Hotel()
	{
		System.out.println(" Welcome to our hotel");
	}
	
	public Hotel(String Waiter )
	{
		System.out.println(" Waiter Asks for the Orders");
	}
	
	public Hotel(String Orders ,int Numberof_Orders )
	{
		System.out.println(" Orders Taken " + Orders);
		
		System.out.println(" Total Number of Orders Given " + Numberof_Orders);
	}
	
	public Hotel(String Order_Confirmed , String Order_Served )
	{
		System.out.println(" Order_Served ");
	}
	
	public Hotel(int Bill )
	{
		System.out.println("Bill Payed " + Bill);
	}
	
	
	
	
	public static void main(String[] args)
	{

		Hotel h = new Hotel();
		
		Hotel Waiter = new Hotel("Waiter");
		
		Hotel orders = new Hotel(" Idly Vada sambar " , 3);

		Hotel orders_confirm = new Hotel("Order for  Idly Vada sambar Confirmed " , " Order Served");

		Hotel Pay_Bill = new Hotel(150);


	}

}
