package threading;

public class HiRunnable implements Runnable{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hi");
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
