package String_Demo;

public class Reverse_String {

public static void main(String[] args)
	
	{
				
		String s1= "madam";
		String output ="";
		for(int i=s1.length()-1;i>=0;i--)
		{			
			char c1=s1.charAt(i);
			output=output+c1;
			
		}		
	    System.out.println(output);

	}

}
