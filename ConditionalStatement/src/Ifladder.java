import java.util.Scanner;

public class Ifladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a,b,c;//
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter  number: ");
			int a= sc.nextInt();
			int b= sc.nextInt();
			int c= sc.nextInt();
			if(a>b && a>c)
			{
				System.out.println(a);
			}
			else if(b>c) 
			{
				System.out.println(b);
			}
			else 
			{
				System.out.println(c);
			}
	}

}
	}
