class phone
{
	public void call()
	{
		System.out.println("");
	}
	public void sms()
	{
		System.out.println("");
	}
}
interface Icamera
{
	void click();
	void record();
}
interface Imusicplayer
{
	void play();
	void stop();
}

class Smartphone extends phone implements Icamera,Imusicplayer
{
	public void videocall()
	{
		System.out.println("video calling");
	}
	public void click()
	{
		System.out.println("clicking photos");
	}
	public void record()
	{
		System.out.println("recording videos");
	}
	public void play()
	{
		System.out.println("playing music");
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
}
public class demo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
    Smartphone sp=new Smartphone();
     sp.call();
     sp.sms();
     //sp.play();
	}

}
