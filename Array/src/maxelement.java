import java.util.Scanner;

public class maxelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 int A[]= {11,2,3,4,5,6,7,9,80};
		 	    int max=A[0];
		 	 
		 	    for(int i=0;i<A.length; i++)
		 	    {
		 	    	if(A[i]>max)
		 	    	{
		 	    		max=A[i];
	                }

}
		 	   System.out.println(max);
	}
	}