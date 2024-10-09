package Assignment1;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListOf_Iterator_Demo 

{

	public static void main(String[] args) 
		

		{
			// TODO Auto-generated method stub
			
			List o1  = new ArrayList();
		    o1.add("10");
		    o1.add("20");
		    o1.add("30");
		    o1.add("40");
		    o1.add("50");
		    o1.add("60");
		    
	       ListIterator m1   =   o1.listIterator();    //Abstract method of list interface since its abs method thats why its is ending in ;
	       while(m1.hasNext())
	       {
	    	   
	    	   System.out.println(m1.next());
	    	   
	    	   
	       }
	       
	       System.out.println("---------------");
	       while(m1.hasPrevious())
	       {
	    	   
	    	   System.out.println(m1.previous());
	    	   
	    	   
	       }
		    

	}

	}


