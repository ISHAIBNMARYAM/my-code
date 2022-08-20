package oop;

class cylinder
{
	public double radius;
	public double height;
	
	public double lidArea()
	{
		return Math.PI*radius*radius;
	}
	public double totalSurfaceArea()
	{
	  return 2*lidArea()+circumference()*height;	
	}
	public double circumference()
	{
		return 2*Math.PI*radius;
	}
	public double volume()
	{
		return lidArea()*height;
	}
}

public class cylinders {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       cylinder c=new cylinder();
       c.radius=7;
       c.radius=10;
       
       System.out.println("lid area:"+c.lidArea());
       System.out.println("total area:"+c.totalSurfaceArea());
       System.out.println("vloume "+c.volume());
	}

}
