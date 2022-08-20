
public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Integer i= new Integer(10);
      Integer a = Integer.valueOf(10);
      Integer b=10;
      
      Byte c=15;
      Byte d=Byte.valueOf("15");
      byte bb=15;
      Byte e=Byte.valueOf(bb);
      Short f=Short.valueOf("123");
      Float g=12.3f;
     // Float h=Float.valueOf("123.5");
      Double j=Double.valueOf(123.456);
      
      Character k=Character.valueOf('A');
      
      Boolean l=Boolean.valueOf("true");
      
      Float h=Float.valueOf("123.5");
      float x=h.floatValue();
      float y=h;
      
      
      int m=10;
      Integer n=Integer.valueOf(m);
      
      int p = n.intValue();
      
       int m1=15;
       Integer m2=Integer.valueOf("123");
      // Integer m2=m1;
       //Integer m3=15;
       Integer m3=Integer.valueOf("A7",16);
       Integer m4=Integer.decode("0xA7");
       System.out.println(Integer.reverseBytes(128)==Integer.MIN_VALUE);
      // m2.equals(m2);
       
	}

}
