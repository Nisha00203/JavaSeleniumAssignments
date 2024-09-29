package Assignment;

import java.util.Scanner;

public class Circum_Of_Circle {

	public static void main(String[] args) 
	{
		final double p = 3.141;
		Scanner cs = new Scanner(System.in);
		System.out.println("Enter the radius ");
		double r = cs.nextDouble();
		double result = 2*p*r;
		System.out.println("Circumference of circle ="+result);
		
		
		

	}

}
