

class DataHiding
{
	private double length;
	private double breadth;
	
	
	public double getlength()
	{
		return length;
	}
	public double getbreadth()
	{
		return breadth;
	}
	public double setLength(double l)
	{
		return length=l;
	}
	public double setbreadth(double b)
	{
		return breadth=b;
	}
	
	
	public double area()
	{
		return length*breadth;
	}
	
	
		public double perimeter()
		{
			return 2*(length+breadth);
		}
		public boolean isSquare()
		{
			if(length==breadth)
				return true;
			else
				return false;
		}
	
}

 public class rectangle
{


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
     rectangles r=new rectangles();
      
      
      r.length=7;
      r.breadth=14;
      
     
      
      System.out.println(r.area());
      System.out.println(r.perimeter());
     
      
     
	}

}