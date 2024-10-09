package Assignment1;

import java.util.Arrays;

public class CheckAnagram {

	public static void main(String[] args)
	
	
	{
		// TODO Auto-generated method stub
		
		String s1="arm";
		String s2="mar";
	    char c[] =  s1.toCharArray();
	    char c1[] = s2.toCharArray();
		Arrays.sort(c);
		Arrays.sort(c1);
		boolean b1=Arrays.equals(c, c1);
		System.out.println(b1);
		if(b1==true)
		{
			System.out.println("They are anagram");
		
		}
		else
			
			System.out.println("They are not anagram");

	}
 
}
