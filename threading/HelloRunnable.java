package threading;

public class HelloRunnable implements Runnable{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello");
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
