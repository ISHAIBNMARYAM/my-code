import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args)
	{
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			int a,b,c;
			float r1,r2;
System.out.println("enter value of a b c: ");


a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
    r1 =(float) ((-b+Math.sqrt(b*b-4*a*c))/(2*a));
    r2 =(float) ((-b-Math.sqrt(b*b-4*a*c))/(2*a));
System.out.println("Root are "+r1+" "+r2);
		}
		
	}

}
