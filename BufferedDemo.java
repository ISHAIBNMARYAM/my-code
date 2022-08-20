import java.io.*;
public class BufferedDemo {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
     FileInputStream fis=new FileInputStream("C:/Users/Dell/Desktop/test.TXT");
    		 BufferedInputStream bis=new  BufferedInputStream(fis);
    		 
    		 int x;
    		 while((x=bis.read())!=-1)
    		 {
    			 System.out.print((char)x);
    		 }
	}

}
