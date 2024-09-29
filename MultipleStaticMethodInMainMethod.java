package Assignment;

public class MultipleStaticMethodInMainMethod 
{
	
	 static void  call()
	    {
	        int a = 10;
	        int b= 20;
	        System.out.println(a+b);
	    }
	    static void  call1()
	    {
	        int a = 100;
	        int b= 200;
	        System.out.println(a+b);
	    }


	public static void main(String[] args)
	
	{
		call();
        call1();

	}

}
