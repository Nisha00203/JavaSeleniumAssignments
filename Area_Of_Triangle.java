package Assignment;

import java.util.Scanner;

public class Area_Of_Triangle {

	public static void main(String[] args)
	
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base");
		double b =sc.nextDouble();
		System.out.println("Enter Height");
		double h =sc.nextDouble();
		double result = (b*h)/2;
		System.out.println("Area of Rectangle="+result);
		
	}

}
