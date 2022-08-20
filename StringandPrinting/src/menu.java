import java.util.Scanner;

public class menu {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     
     System.out.println("menu");
     System.out.println("====");
     System.out.println("add");
     System.out.println("sub");
     System.out.println("mul");
     System.out.println("div");
     
     System.out.println("enter 2 numbers");
     int x=sc.nextInt();
     int y=sc.nextInt();
     sc.nextLine();
     System.out.println("enter option in word ");
     String option=sc.nextLine();
     
     switch(option)
     {
     case "add": System.out.println("sum is "+(x+y));
     break;
     case "sub": System.out.println("dif is "+(x+y));
     break;
     case "mul": System.out.println("product is "+(x+y));
     break;
     case "div": System.out.println("ratio is "+(x+y));
     break;
     }
	}

}
