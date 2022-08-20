import java.util.Scanner;

public class reversenumber {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      
      System.out.println("enter a number");
      int n=sc.nextInt();
     int r;int rev = 0;
      while(n>0)
      {
    	  r=n%10;
    	  n=n/10;
    	  rev=rev*10+r;
      }  
      System.out.println(rev);
	
      System.out.println(n);
	}

}