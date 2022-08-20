package mycode;

public class Ternary {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      Object obj1;
      Object obj2;
      if(true)
      {
    	  obj1 = new Integer(10);
      }
      else
      {
    	  obj1 = new Double(15.0);
      }
      System.out.println(obj1);
      obj2 = true?new Integer(10) :new Double(15.0);
      System.out.println(obj2);
      
	}

}
