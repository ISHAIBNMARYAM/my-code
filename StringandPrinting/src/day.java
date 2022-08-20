import java.util.Scanner;

public class day {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter day number");
		int day=scan.nextInt();
		
     switch(day)
     {
     case 1: System.out.println("monday");
     break;
     case 2: System.out.println("tuesday");
     break;
     case 3: System.out.println("wednesday");
     break;
     case 4: System.out.println("thrusday");
     break;
     case 5: System.out.println("friday");
     break;
     case 6: System.out.println("saturday");
     break;
     case 7: System.out.println("sunday");
     break;
     default : System.out.println("invalid");
     break;
     }
	}

}
