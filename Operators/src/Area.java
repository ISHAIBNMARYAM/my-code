import java.util.Scanner;

public class Area {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        
		float base,height,area;
	System.out.println("enter base and height");
	try (Scanner sc = new Scanner(System.in)) {
		base=sc.nextFloat();
		height=sc.nextFloat();
	}
	
	area = base*height*0.5f;
	System.out.println("Area of triangle is "+area); 
	}

}
