
interface test
{
	void meth1();
	void meth2();
}

 class  my implements test
{
  public void meth1()
  {
	  System.out.println("meth1 of my class");
  }
  public void meth2()
  {
	  System.out.println("meth2 of my class");
  }
  public void meth3()
  {
	  System.out.println("meth3 of my class"); 
  }
}
public class practice {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
      test t=new my();
      t.meth1();
      t.meth2();
     // t.meth3();
	}

}
