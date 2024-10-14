package Assignment1;
// Developing a method in the parent class with same name , same signature as child bus but different
// implementation is called method overiding


//Rules to achieve method overriding ??
	//1. both class must have relation
	//2. in java we can only override non static method
	// 3. method in parent class must exact be same in child class but with different implementation

// what is signature of method..?
// return type of the method and its parameter should be same1


// if 2 classes present in the same program, both 2 classes cannot be the child class
// only that can be the child class class which is present in package explorer is the child class

// parent class method gets override ie.. it gets suppresed and parent class method wont get executed

//super.method name helps to call super class implementation together with child class implementatio

class ParentDemo

{
	
	void login(String emailid)
	{
		  
		System.out.println("inside parent");
		
	}

}	

public class MethodOverideDemo extends ParentDemo
{

	
		void login(String emailid)
		{
			super.login(emailid);
			System.out.println("inside child");
		}

			
public static void main(String[] args)
{
	
	
	     MethodOverideDemo ob = new MethodOverideDemo();
		 ob.login("nisha@122");
	
	
	
}
		
		
	
}



// Assignment 62 WAP for method overriding






