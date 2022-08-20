
public class arraybasic {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
     int A[]=new int[10];
     int B[]= {1,2,3,4,5};
     int C[];
     C=new int[10];
     
    B[2]=15;
    for(int x:B)
    {
    	System.out.println(x++);
    }
    for(int x:B)
    {
    	System.out.println(x);
    }
	}

}
