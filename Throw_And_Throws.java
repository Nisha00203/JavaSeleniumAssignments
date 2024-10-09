package Assignment1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Throw_And_Throws {

	public static void main(String[] args)  throws InputMismatchException
	
	{
		
		{

			System.out.println("Enter Age");
			Scanner sc = new Scanner(System.in);
			int age = sc.nextInt();
			System.out.println("Correct Age Entered " + age);
			if(age != 18)
			{
			throw new InputMismatchException("Minor");
			}

		}

	}
		
		

	}


