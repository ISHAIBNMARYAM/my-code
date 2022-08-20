
public class secondlargest {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int A[]= {11,2,3,4,5,6,7,9,80};
		int max1,max2;
 	    max1=max2=A[0];
 	 
 	    for(int i=0;i<A.length; i++)
 	    {
 	    	if(A[i]>max1)
 	    	{
 	    		max2=max1;
 	    		max1=A[i];
            }
 	    	else if(A[i]>max2)
 	    	{
 	    		max2=A[i];
 	    	}

}
 	   System.out.println("second largest element :" +max2);
}
}
