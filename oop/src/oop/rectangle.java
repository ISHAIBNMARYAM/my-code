package oop;

class rectangles
{
	public double length;
	public double breadth;
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