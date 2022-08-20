import java.util.Scanner;

public class Young {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try (Scanner sc=new Scanner(System.in))
     {
    	 System.out.println("enter the age: ");
    	 int age=sc.nextInt();
    	if(age>=14 && age<=55)
    	{
    		System.out.println("young");
    	}
    	else
    	{
    		System.out.println("not young");
    	}
     }
	}

}
