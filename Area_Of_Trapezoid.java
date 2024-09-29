package Assignment;

import java.util.Scanner;

public class Area_Of_Trapezoid {

	public static void main(String[] args)
	
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the base");
		double a=sc.nextDouble();
		System.out.println("Enter the base");
		double b=sc.nextDouble();
		System.out.println("Enter the height");
		double h=sc.nextDouble();
		double result =  (a+b)/2*h;
		System.out.println(result);
		

	}

}
