import java.util.Scanner;

public class ap {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     
     System.out.println("program to print ap series");
     System.out.println("enter a, d, and n");
     int a=sc.nextInt();
     int d=sc.nextInt();
     int n=sc.nextInt();
     int term=a;
     for(int i=0;i<n; i++)
     {
    	 System.out.print(term+",");
    	 term=term+d; 
     }
	}

}
