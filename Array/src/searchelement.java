
import java.util.Scanner;
public class searchelement {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub	 
		 Scanner sc=new Scanner(System.in);
int A[]= {11,2,3,4,5,6,7,9,80};
	    int key;
	    
	    System.out.println("enter a key");
	   
	    key=sc.nextInt();
	
	
	    for(int i=0;i<A.length; i++)
	    {
	    	if(key==A[i])
	    	{
	    		System.out.println("element found at :"+i);
	    		System.exit(0);
	    	}
	    }
	    	
	    System.out.println("not found");
	}
}