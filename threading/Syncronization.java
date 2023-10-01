package threading;

public class Syncronization {
	int i=0;
	/*
	 	If not written then multiple threads would be able to access the  thread at a time 
	 	resulting in race condition
	 */
	public synchronized void increment()
	{
		i++;
	}
	public static void main(String[] args) throws InterruptedException {
		Syncronization sync=new Syncronization();
		Runnable run1=()->
		{
			for(int i=0;i<1000;i++)
			{
				sync.increment();
			}
		};
		Runnable run2=()->
		{
			for(int i=0;i<1000;i++)
			{
				sync.increment();
			}
		};
		Thread t1=new Thread(run1);
		//We need to pass object in thread class
		
		Thread t2=new Thread(run2);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println(sync.i);
	}
}
