package Assignment1;

public class Count_Space_Alpha_Specichar_NumAndSpac 

{

	
	public static void main(String[] args) 
	{
		String str = "Automation Selenium Batch45*@";
		
		int count_alphabets = 0;
		int count_whtSpaces = 0;
		int count_num = 0;
		int str_Length = str.length();
		
		char array_str[] = str.toCharArray();
		for (int i=0; i < array_str.length; i++)
		{
			if(Character.isAlphabetic(array_str[i]))
			{
				count_alphabets++;
			}
			if(Character.isWhitespace(array_str[i]))
			{
				count_whtSpaces++;
			}
			if(Character.isDigit(array_str[i]))
			{
				count_num++;
			}
		}
		
		int SpecialCharacterCount = str_Length - (count_alphabets+count_whtSpaces+count_num);
		System.out.println("Given String is -------> "+str);    	
		System.out.println("Alphabates in  the given String is -----> "+count_alphabets);   
		System.out.println("Spaces in the given String is - "+count_whtSpaces);			
		System.out.println("Numerics in the given String is - "+count_num);				
		System.out.println("Special Character in the given String is - "+SpecialCharacterCount);		
		
		
		
		
		

	}

}
	
	
	
	
	
	
	

