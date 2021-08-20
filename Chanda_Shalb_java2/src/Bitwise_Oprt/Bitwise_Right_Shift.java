package Bitwise_Oprt;

import java.util.Scanner;

public class Bitwise_Right_Shift {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" enter the value num_1 : ");
		
		byte num_1= sc.nextByte();
		
		
		byte c = (byte) ( num_1>>2 );
		
		System.out.println("Result : " + c);
		
	}

}
