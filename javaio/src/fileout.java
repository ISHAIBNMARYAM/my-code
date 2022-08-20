
import java.io.FileOutputStream;
import java.io.IOException;

public class fileout {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
      FileOutputStream fos=new FileOutputStream("C:/Users/Dell/Desktop/cses/weird.java");
      String str="leranin java program";
      fos.write(str.getBytes());
      fos.close();
      }
          catch(FileNotFoundExeception e)
		      {
	           System.out.println(e);
	           }
}
}
