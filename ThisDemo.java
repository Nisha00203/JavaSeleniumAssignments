package Assignment1;

public class ThisDemo 

{
	
	  String name = "Nisha";
	  int rollno = 12;
	  
void method1(String a , int b)

{
		
	   this.name = a;
	   this.rollno =b;
	
}


	

public static void main(String[] args) 
	
	
{
	
	ThisDemo on = new ThisDemo();
	on.method1("UpdatedName", 1000);
	System.out.println(on.name);
	System.out.println(on.rollno);
	
	
	

	
}


}
	
	
	
	
	
	
	
	
	

