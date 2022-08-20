import java.util.Scanner;

public class armstrong {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      
      System.out.println("enter a number");
      int n=sc.nextInt();
     int r;int sum=0;int m=n;
      while(n>0)
      {
    	  r=n%10;
    	  sum=sum+r*r*r;
          n=n/10;
      //System.out.println(sum);//
	}
      if(sum==m)
            System.out.println("its a armstrong number");
      else
    	  System.out.println("its not a armstrong number");
	}
		
		

}