import java.util.Scanner;

public class NameOfDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    try (Scanner sc=new Scanner(System.in)){
      System.out.println("enter the number: ");
		int num=sc.nextInt();
		if(num==1)
		{
			System.out.println("Monday");
		}
		else if(num==2)
		{
			System.out.println("Tuesday");
		}
		else if(num==3)
		{
			System.out.println("Wednsday");
		}
		else if(num==4)
		{
			System.out.println("Thrusday");
		}
		else if(num==5)
		{
			System.out.println("Friday");
		}
		else if(num==6)
		{
			System.out.println("Saturday");
		}
		else if(num==7)
		{
			System.out.println("Sunday");
		}
		else
		{
			System.out.println("Not a day");
		}
			
      }
	}

}
