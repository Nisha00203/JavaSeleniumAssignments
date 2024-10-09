package Assignment1;

public class Local_Global_FinalPrint 

{
	
	final String  college = "GroTech";
	String course = "Automation";
	
	void method1()
	{
		
		
		String studentname = "Nisha";
		System.out.println(studentname);
		
		
			
	}
	
public static void main(String[] args) 
	
	{
	   
	   Local_Global_FinalPrint ob  = new Local_Global_FinalPrint();
	   ob.method1();
	   System.out.println("Final Global value = "+ob.college);
	   System.out.println("Global value ="+ob.course);
	   
	
	   
		
		
		
		
		
		
		
	}

}
