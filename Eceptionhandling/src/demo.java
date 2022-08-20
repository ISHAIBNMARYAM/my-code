import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a,b,c;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter 2 numbers");
     a=sc.nextInt();
     b=sc.nextInt();
     
     try 
     {
    	 c=a/b;
 		System.out.println(c); 
     }
     catch(ArithmeticException e)
     {
    	 System.out.println("denominator not divide by zero, try again"); 
     }
     System.out.println("bye");
		
		
		
	}

}
