package Assignment1;

public class ThisCallingStatement

{

	ThisCallingStatement()
	{
		
		System.out.println("Constructor without para");
	}
	
	
	ThisCallingStatement(int a)
	{

	    this();
		System.out.println("Constructor para1");
	}
	
	ThisCallingStatement(float a, double d)
	{

		this(3);
		System.out.println("Constructor para2");
	}
	

	public static void main(String[] args) 
	
	{
		ThisCallingStatement ob = new ThisCallingStatement(2,2);
		//ThisKeyword ob1 = new ThisKeyword();
		//ThisKeyword ob2 = new ThisKeyword(2,2);
		

	}
	
	

}
