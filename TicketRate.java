package Assignment;

public class TicketRate {

	public static void main(String[] args)
	
	{
		
		String str = "Male";
		String gender = "Female";
		int age = 0;
		int age1 = 12;	
		int age2 = 22;
		int age3 = 61;
		
		
		if (age < 2)    //T 
		{
			
			if(age1 > 2 && age >=12)
			{
				System.out.println("Half Ticket");
				
			}
			
			if (age2 > 20)
			{
				
				System.out.println("Full ticket for adult");
			}
			else
			{ 
				System.out.println(" No Full ticket for adult");
				
			}
			
			if(age3 > 60)
				
			{
				System.out.println(" Half Ticket for senior citizen");
				
			}
			else
			{ 
				System.out.println(" Half Ticket for senior citizen");
				
			}
			
			if (gender=="Female") 
			{
				System.out.println("Free ticket for female");
				
			}
			
			
		}

	}
	
}



