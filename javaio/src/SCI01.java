import java.io.*;

public class SCI01 
{
    public static void main(String[] args) throws Exception
    {
        
        FileInputStream fis1=new FileInputStream("Source1.txt");
        FileInputStream fis2=new FileInputStream("Source2.txt");
        
        FileOutputStream fos=new FileOutputStream("Destination.txt");
                
        SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
        
        
        int b;
        while((b=sis.read())!=-1)
        {
            // if(b>=65 && b<=90) fos.write(b+32);
             fos.write(b);
            
        }
        
        sis.close();
        fis1.close();
        fis2.close();
        fos.close();
        
    }   
}