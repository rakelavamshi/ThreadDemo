
public class One extends Thread
{
	public void run()
	{
		System.out.println("running");
	}
	public static void main(String[] args)
	{
		One t1=new One();
		t1.start();
	}
}
