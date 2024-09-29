package Assignment;

public class StaticNonStatic 
{
	
	
	void method1()
	{
		System.out.println("This is non static method1");
	}
	
	void method2()
	
	{
		System.out.println("This is non static method2");
	}
	
	static void method3()
	{
		
		System.out.println("This is static method3");
	}
	
	static void method4()
	{
		System.out.println("This is static method4");
	}
	public static void main(String[] args) 
	
	{
		
		StaticNonStatic ob = new StaticNonStatic();
		ob.method1();
		ob.method2();
		ob.method3();
		method3();
		StaticNonStatic.method3();

	}

}
