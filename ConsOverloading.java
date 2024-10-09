package Assignment1;

public class ConsOverloading{

	
	
	ConsOverloading(int a )
	{
		
		System.out.println("inside cons a");
		
		
		
	}
	

	ConsOverloading(double  b )  
	{
		
		System.out.println("inside cons b");
		
		
		
	}
	

	ConsOverloading()
	{
		
		
		System.out.println("inside empty");
		
		
		
	}
	
public static void main(String[] args) 
	
	
	{
	    ConsOverloading ob  = new  ConsOverloading(10);
		new  ConsOverloading(2.2);
	    new  ConsOverloading();
		
		
		
	
	}




}
