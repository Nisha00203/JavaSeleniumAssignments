package Arrays_Demo;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub

		
	    int Rev[] = new int[4];
		Rev[0]=2;
		Rev[1]=4;
		Rev[2]=6;
		Rev[3]=8;
	
		
	   int Revresult[]= new int[4];
	   
	   for (int i=0, k =3 ;i<Rev.length;i++)
		   
	   {
		     Revresult[k] =  Rev[i];
		     k--;

		   
	   }
		
	     System.out.println(Arrays.toString(Rev));
	     System.out.println(Arrays.toString(Revresult));
		
	}
}



//Program to copy one array to another in reverse order




