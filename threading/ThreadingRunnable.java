package threading;

class T1 implements Runnable
{
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
				
			}
		}
	}
}
public class ThreadingRunnable {

	public static void main(String[] args) throws Exception {
		T1 t=new T1();
		Runnable r=new T1();
		Thread t1=new Thread(t);
		t1.start();
		t1.join();
		System.out.println(t1.getName());
		System.out.println(t1.MAX_PRIORITY);
		System.out.println(t1.MIN_PRIORITY);
		System.out.println(t1.isAlive());

	}

}
