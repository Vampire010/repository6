package Abstraction_ex;

public class facebook_V2 extends facebook_V1
{

	@Override
	public void user_dp_video() 
	{
		System.out.println("user uploaded DP as a Video ");

	}

	
	
	public static void main(String[] args) 
	{
		facebook_V2 v2 = new facebook_V2();
		v2.user_dp_imgae();
		v2.user_dp_video();
			
	}

	
}
