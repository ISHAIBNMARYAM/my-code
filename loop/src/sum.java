import java.util.Scanner;

public class sum {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      
      System.out.println("enter a number");
      int n=sc.nextInt();
      int sum = 0;
      for(int i = 1; i<=n; i++)
      {
    	  sum=sum+i;
      }
      System.out.println("sum of "+n+" number is "+sum);
	}

}