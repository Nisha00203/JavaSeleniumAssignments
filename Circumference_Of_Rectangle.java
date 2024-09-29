package Assignment;

import java.util.Scanner;

public class Circumference_Of_Rectangle {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the length");
		double l = sc.nextDouble();
		System.out.println("Enetr the width");
		double w = sc.nextDouble();
		double result = 2*(l+w);
		System.out.println("Circumference of rectangle ="+result);
		

	}

}
