package Assignment;

	class Base 
	 { 
		 public void M1() 
		 { 
			 System.out.println("Welcome");
		 } 
	 } 
	class Derived extends Base 
	{ 
		 public void M2() 
		 { 
			 System.out.println("Welcome1");
		 } 
	} 
	class Test 
	{ 
		 public static void main(String[] args) 
		 { 
			 Derived d = new Derived(); // creating object 
			 d.M1(); // print Base Class Method 
			 d.M2(); // print Derived Class Method 
		 } 
	 
	}