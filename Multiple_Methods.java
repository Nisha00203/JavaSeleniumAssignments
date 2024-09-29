package Assignment;

public class Multiple_Methods

{
	
	Multiple_Methods()
	{
		
		System.out.println("With no parameter");
	}
	Multiple_Methods(int a)
	{
		
		System.out.println("constructor with parameter");
	}
	
	Multiple_Methods(int a, double b)
	
	{
        
		double c = a+b;
		System.out.println("Addition of 2 number contructor ="+c);
	}
	
	static void method1()
	{
		System.out.println("Static method 1");
	}
	
	static void method2(int a , double b)
	{
		double c = a*b;
		System.out.println("Static method 2 ="+c);
	}
	static void method3(double x, int y)
	
	{
		double z = x/y;
		System.out.println("Static method 2="+z);
	}
	
	
	void nonmethod1()
	{
		
			System.out.println("NonStatic method 1");		
		
	}
	
	void nonmethod2(String s, int a)
	{
		
		    
			System.out.println("NonStatic method 2");		
		
	}
	void nonmethod3(int a , float b, int c)
	{
		     
		    double d = a+b+c;
			System.out.println("NonStatic method 3 Result ="+d);		
		
	}
	

	public static void main(String[] args)
	
	{
		Multiple_Methods ob = new Multiple_Methods();
		Multiple_Methods ob1 = new Multiple_Methods(2);
		Multiple_Methods ob2 = new Multiple_Methods(2,2);		
		method1();
		method2(2,2);
		method3(2.2,2);
		ob.nonmethod1();
		ob.nonmethod2("Nisha", 2);
		ob.nonmethod3(2,   5, 6);
		
		
		
		
		

	}

}










//WAP in which there are 3 static methods
//3 nonstatic methods & 3 constructors
//3 static methods can be parameterized? 
//3 non-static methods can be parameterized? 
//3 Constructors can be parameterized?