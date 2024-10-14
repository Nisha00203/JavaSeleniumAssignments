package Assignment1;

public class Continue_Keryword {
	
	// is used to skip a particular iteration

	public static void main(String[] args)
	
	{
		
		for (int i=1 ;i<10 ;i++)
		{
			if(i==4)
			{
				
				continue;          // skips the 4th iteration and continue further
				
			}
			System.out.println(i);			
		}
		

	}

}
