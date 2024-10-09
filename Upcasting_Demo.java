package Assignment1;


class one_28
{
	
	
	void add()
	{
		
		System.out.println("Inside add");
		
	}
	
	void add1()
	{
		
		System.out.println("Inside add1");
		
	}
	
	void add2()
	{
		
		System.out.println("Inside add2");
		
	}
	
}

public class Upcasting_Demo extends one_28  {

	public static void main(String[] args) 
	
	
	
	{
		// TODO Auto-generated method stub
		
		
		       one_28 o1 =     new one_28 ();
		       o1.equals(true);                                 // accessing parent class property and its parent ie object class properties
			   o1.add();
		       o1.add1();
		       o1.add2();
		       System.out.println(o1);
		       
		       

	}

}
