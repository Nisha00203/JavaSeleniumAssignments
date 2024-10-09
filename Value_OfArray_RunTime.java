package Assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class Value_OfArray_RunTime 

{

	public static void main(String[] args) 
	
	{
		
		int arr[] = new int[4];
		System.out.println("Enter the values");
		Scanner sc = new Scanner(System.in);
		for(int i =0;i<arr.length;i++)
		{ 
		
			arr[i]    =  sc.nextInt();
		

	    }
		
		System.out.println("Result = "+Arrays.toString(arr));

    }
	
	
}
