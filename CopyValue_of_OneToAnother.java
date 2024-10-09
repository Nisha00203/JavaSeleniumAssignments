package Assignment1;

import java.util.Arrays;

public class CopyValue_of_OneToAnother {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		
				int rollno[]= new int[5];
				rollno[0]=10;
				rollno[1]=15;
				rollno[2]=20;
				rollno[3]=25;
				rollno[4]=30;
				int rollno1[]= new int[5];		
				for(int i=0;i<5;i++)
				{
				
				rollno1[i]=rollno[i];
				
				}

				System.out.println( " Values are successfully copied to  "+Arrays.toString(rollno1));
				
				//System.out.println(Arrays.toString(rollno));

	}

}
