import java.util.Scanner;

public class Areaoftriangle {

	public static void main(String[] args) 
	{
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			int a,b,c;
			float s,area;
System.out.println("enter side of triangle: ");


a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
s = (a+b+c)/2f;
area =(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
		}
		System.out.println("Area of triangle is "+args); 
	
	}

}
