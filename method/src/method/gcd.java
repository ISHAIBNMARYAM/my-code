package method;

public class gcd {
	static int hcf(int m, int n)
	{
		while(m!=n)
		{
			if(m>n)m=m-n;
			else n=n-m;
		}
		return m;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      System.out.println(hcf(35, 56));
	}

}
