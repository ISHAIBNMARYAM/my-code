import java.util.Scanner;

public class StudentChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a email: ");
			String str= sc.nextLine();

  //   String str = "programmer@gmail.com";//
    int i=str.indexOf("@");
    String uname = str.substring(0,i);
    String domain = str.substring(i+1,str.length());
    System.out.println("Username :" +uname);
    System.out.println("Domain :" +domain);
    System.out.println(domain.startsWith("gmail"));
		}
	}

}
