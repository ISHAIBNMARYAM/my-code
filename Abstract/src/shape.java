abstract class shapes
{
	abstract public double perimeter();
	abstract public double area();
}
class circle extends shapes
{
	double radius;
	
	public double perimeter()
	{
		return 2*Math.PI*radius;
	}
	public double area()
	{
		return Math.PI*radius*radius;
	}
}

class rectangle extends shapes
{
	double length;
	double breadth;

  public double perimeter()
  {
   return 2*(length+breadth);	
  }
  public double area()
  {
	return length*breadth;
  }
}
public class shape {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
   rectangle r=new rectangle();
   r.length=10;
   r.breadth=5;
   System.out.println(r.area());
	}

}
