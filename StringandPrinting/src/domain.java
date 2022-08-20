import java.util.Scanner;

public class domain {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter domain name");
       String domain=scan.nextLine();
       
       String ext=domain.substring(domain.indexOf(".")+1);

		
     switch(ext)
     {
     case "com": System.out.println("commercial");
     break;
     case "org":System.out.println("organisation");
     break;
     case "gov": System.out.println("government");
     break; 
     case "net":System.out.println("netwoek");
     break;
     }
 }
}   
  
     