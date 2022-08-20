import java.io.*;
public class ByteDemo {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
    //  byte b[]= {'a','b','c','d','e','f','g','h','i','j'};
   //   ByteArrayOutputStream bos=new ByteArrayOutputStream(20);
      
      /* String str=new String(bis.readAllBytes());
      int x;
      
      while((x=bis.read())!=-1)
      {
    	  System.out.print((char)x);
      } 
      System.out.println(bis.markSupported());
      bis.close();
	*/ 
    /* bos.write('a');
      bos.write('b');
      bos.write('c');
      bos.write('d');
      bos.write('e');
     */ 
   /*   byte b[]=bos.toByteArray();
    
	for(byte x:b) 
		System.out.println((char)x);
      
      bos.close();
      */
     // bos.writeTo(new FileOutputStream("C:/Users/Dell/Desktop/test.TXT"));
     // bos.close();
      
      char c[]= {'a','b','c','d','e','f','g','h','i','j'};
      CharArrayReader cr=new CharArrayReader(c);
      
      //String str=new String(bis.readAllBytes());
      int x;
      
      while((x=cr.read())!=-1)
      {
    	  System.out.print((char)x);
      } 
	}
}
