import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try (Scanner sc=new Scanner(System.in))
     {
    	System.out.println("enter the Year: ");
    	int Year=sc.nextInt();
    	if(Year%4==0)
    	{
    		if(Year%100==0)
    		{
    			if(Year%400==0)
    			
    				{
            			System.out.println("Leap year");
            		}
            		else
            		{
            			System.out.println("Not a leap year");
            		}
    			
    		}
    		else
    		{
    			System.out.println("leap year");
    		}
    	}
    	else
    	{
    		System.out.println("Not a leap year");
    	}
     }
	}

}
