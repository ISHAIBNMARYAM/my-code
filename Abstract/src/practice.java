
 abstract class Super
{
    public Super() 
	{
		System.out.println("super constructor");
	}
	public void meth1() 
	{
		System.out.println("meth1 of super");
	}
	
	abstract public void meth2();
	
}
 
 class Sub extends Super
 {
	 @Override
	 public void meth2()
	 {
		 System.out.println("sub meth2");
	 }
 }
public class practice {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
       Super s=new Sub();
       s.meth1();
	}

}
