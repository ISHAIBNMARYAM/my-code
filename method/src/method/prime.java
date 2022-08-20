package method;

public class prime {
	
	static boolean isprime(int n)
	{
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}

	public static void main(String[] args)
	{
		int isprime=0;
	// TODO Auto-generated method stub
     System.out.println(isprime(19));
	}

}
