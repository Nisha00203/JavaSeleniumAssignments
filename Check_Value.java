package Assignment1;

public class Check_Value

{

public static void main(String[] args) 
{
	int rollno[]=new int[4];
	rollno[0]=78;
	rollno[1]=88;
	rollno[2]=98;
	rollno[3]=34;
	
	int notocheck=34;
	for(int i=0;i<4;i++)
	{
	if(notocheck==rollno[i])
	{
		System.out.println("The Given no->"+notocheck +" is the part of Array");
		System.out.println("The Given no->"+notocheck +" and its index is -> "+i);

	}
	}
	
	

}	
		
}




//Assignmnet 44
//Create a array of size
// 5 and just check 34
 //is present in array or not