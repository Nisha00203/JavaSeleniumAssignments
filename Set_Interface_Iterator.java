package Assignment1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Interface_Iterator {

	public static void main(String[] args) 
	{
		
		
		     Set si  =  new  HashSet();
		     si.add(10);
		     si.add("Nisha");
		     si.add("MR");
		     si.add(" ");
		     si.add(14);
		     Iterator  li  =  si.iterator();
		     while(li.hasNext())
		     {
		    	 
		    	 System.out.println(li.next());
		    	 
		     }
		     
		     
		
	}

}
