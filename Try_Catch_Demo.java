package Assignment1;

public class Try_Catch_Demo 
{

public static void main(String[] args) 
	
	{
		
			try
			{
				
				int Result=1/0;
				System.out.print("No Exception");
			}
				catch(ArithmeticException a1)
				{
					System.out.print("Arithmetic Exception");
				}
				
		}
		
}

	


