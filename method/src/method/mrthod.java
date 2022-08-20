package method;

public class mrthod {
	static void change(int[] a, int index, int value)
	{
		a[index]=value;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
     int A[]= {2,4,6,8,10};
     
     change(A,2,20);
     
     for(int x:A)
     {
    	 System.out.println(x);
     }
	}

}
