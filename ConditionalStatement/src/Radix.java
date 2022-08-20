import java.util.Scanner;

public class Radix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try (Scanner sc=new Scanner(System.in))
     {
    	System.out.println("enter the number: ");
    	String num=sc.nextLine();
    	if(num.matches("[01]+"))
    	{
    		System.out.println("Binary Radix=2");
    	}
    	else if(num.matches("[0-8]+"))
    	{
    		System.out.println("Octal Radix=2");
    	}
    	else if(num.matches("[0-9]+"))
    	{
    		System.out.println("Deciaml Radix=2");
    	}
    	else if(num.matches("[0-9A-F]+"))
    	{
    		System.out.println("Hexa Decimal Radix=2");
    	}
    	else 
    	{
    		System.out.println("Not A Number");
    	}
    	
     }
	
	}

}
