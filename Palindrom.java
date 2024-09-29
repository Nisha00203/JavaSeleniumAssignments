package String_Demo;

public class Palindrom 

{

public static void main(String[] args) 
	
	{
		
		String str = "madam";
		String output = "";
		int len = str.length();
		for (int i=len -1; i>=0 ;i--)
		{
			
			char c1 = str.charAt(i);
			output  = output+c1;
			
		}
		
			//System.out.print("result ="+output);
			
		    if(str.equalsIgnoreCase(output)==true)
			{
				System.out.println("Entered string is palindrom");
				
			}
			
			else 
			
				
				System.out.println("Entered string is not palindrom");
	   
		    }

}
	
	









