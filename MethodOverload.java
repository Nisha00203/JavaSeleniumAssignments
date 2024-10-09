package Assignment1;

public class MethodOverload 
{

		static void add(int a)
		{
				System.out.println("Static block");
		}
		
		static void add(double b)
		{
			System.out.println("Static block1");
		}
		
		static void add(double c , int a)
		{
			
			System.out.println("Static block2");
		}
		void add(float a , double c)
		{
			System.out.println("Non static");
			
		}
		
		void add(int c , double a)
		{
			{
				System.out.println("Non static1");
				
			}
			
		}
		void add(int  c , int a)
		{
			{
				System.out.println("Non static2");
				
			}
			
		}
		
		public static void main(String[] args) 
		
		{
			
			add(2);
			add(2.2);
			add(2.2,1);
		    MethodOverload ob = new MethodOverload();
			ob.add(2.1f,2.2);
			ob.add(1,2.2);
			ob.add(1,1);
			
		}
		

}


