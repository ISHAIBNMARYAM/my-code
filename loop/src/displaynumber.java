
import java.util.Scanner;

public class displaynumber {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      
      System.out.println("enter a number");
      int n=sc.nextInt();
     int r;
     String str="";
      while(n>0)
      {
    	  r=n%10;
    	  n=n/10;
    	  str=str+r;
      }    
      System.out.println(str);
      
      char c;
	for(int i=str.length()-1;i>=0;i--)
	{
		c=str.charAt(i);
		switch(c) 
		{
		case '0':System.out.print("zero "); 
		break;
		case '1':System.out.print("one "); 
		break;
		case '2':System.out.print("two "); 
		break;
		case '3':System.out.print("three "); 
		break;
		case '4':System.out.print("four "); 
		break;
		case '5':System.out.print("five "); 
		break;
		case '6':System.out.print("six "); 
		break;
		case '7':System.out.print("seven "); 
		break;
		case '8':System.out.print("eight "); 
		break;
		case '9':System.out.print("nine "); 
		break;
		}
	}
      
	}

}