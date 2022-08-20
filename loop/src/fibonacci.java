import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     
     System.out.println("program to print ap series");
     System.out.println("enter a, b, and c");
     int n=sc.nextInt();
     //int b=sc.nextInt();//
   //  int c=sc.nextInt();//
     int a=0,b=1,c;
     
     System.out.print(a+","+b+",");
     for(int i=0;i<n-2; i++)
     {
    	 c=a+b;
    	 System.out.print(c+",");
    	 a=b;
    	 b=c;
     }
	}

}