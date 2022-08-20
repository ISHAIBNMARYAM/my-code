
class MyObject
{
  	public String toString()
  	{
  		return "My Object";
  	}
  	public int hashCode()
  	{
  		return 100;
  	}
  	public boolean equals(Object o)
  	{
  		return this.hashCode()==o.hashCode();
  	}
  	public void wait()
  	{
  		
  	}
}

public class objectclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //   Object o1=new Object();
      // Object o2=o1;
       //System.out.println(o1);
		MyObject o1=new MyObject();
		MyObject o2=new MyObject();
		System.out.println(o1.equals(o2));
		
	}

}
