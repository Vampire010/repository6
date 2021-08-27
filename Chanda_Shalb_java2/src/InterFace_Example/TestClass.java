package InterFace_Example;

public class TestClass implements In1,In2
{
	
	@Override
	public void display() 
	{
		System.out.println("Hello Im From Interface_1");		
	}

	public static void main(String[] args)
	{
		TestClass t = new TestClass();
		
		t.display();
		t.scan();
		
		System.out.println(a);
		
		
	}

	@Override
	public void scan() 
	{
		System.out.println("Hello Im From Interface_2");		

	}


}
