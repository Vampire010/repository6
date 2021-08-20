package Array_ex;

public class Array_ex4 {

	public static void main(String[] args) 
	{
		int[][] num = {  
							{44, 66 ,88},
							{55,69 ,90},
							{14,43,18}
						  };
		
		
	//	System.out.println(num[0][2]);
	//	System.out.println(num[2][1]);
	//	System.out.println(num[0][0]);

		 for (int i = 0; i < num.length; ++i) 
		 {
	            for(int j = 0; j < num[i].length; ++j) 
	            {
	                System.out.println(num[i][j]);
	            }
	            
	            
	        }



		
	}

}
