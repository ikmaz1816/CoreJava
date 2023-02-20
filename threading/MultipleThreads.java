package threading;

class Thread1 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Thread1");
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
class Thread2 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Thread2");
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
public class MultipleThreads {

	public static void main(String[] args) throws Exception {
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		
		
		//With thread class
		//The start method internally calls the run method

		Thread obj1=new Thread(t1);
		obj1.start();
		
		Thread obj2=new Thread(t2);
		obj2.start();
		
		//The join method is used to stop the execution of main until the thread's execution is completed.
		obj1.join();
		obj2.join();
		
		System.out.println("Bye");
	}

}
