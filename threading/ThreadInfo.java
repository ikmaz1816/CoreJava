package threading;

public class ThreadInfo {
	/*
	 	With the use of parallel System it was necessary to use threads 
	 	Thread reduce time complexity
	 	Threads are of tow types
	 	Synchronous 
	 	Asynchronous
	 	
	 	Synchronous->Only one Thread will be allowed at a time 
	 	Asynchronous->Many threads can access the resource at a time
	 	
	 	Synchronous->transaction management
	 	Asynchronous->Video Streaming
	 	
	 	Thread internally calls the run method
	 */
	
	public static void main(String[] args) throws InterruptedException {
		/*
		 	Let us create two threads by extending the thread class and call it here
		 */
		HiThread hi=new HiThread();
		
		HelloThread hello=new HelloThread();
		
		Thread t1=new Thread(hi);
		//We need to pass object in thread class
		
		Thread t2=new Thread(hello);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		//We can extend the thread class or implement the Runnable interface
		Runnable hi1=new HiRunnable();
		
		Runnable hello1=new HelloRunnable();
		
		t1=new Thread(hi1);
		t2=new Thread(hello1);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		//using anonymous with any class
		Runnable run1=new Runnable()
				{
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
		};
		Runnable run2=new Runnable()
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
						e.printStackTrace();
					}
				}
			}
		};
		
		t1=new Thread(run1);
		t2=new Thread(run2);
		
		t1.start();
		t2.start();
		//Join is used so that until both the threads are completed no other functionality will
		//be called
		t1.join();
		t2.join();
		
		//using lambda function
		Runnable run3=()->{
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
		};
		
		Runnable run4=()->{
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
		};
		
		t1=new Thread(run3);
		t2=new Thread(run4);
		
		t1.start();
		t2.start();
		//Join is used so that until both the threads are completed no other functionality will
		//be called
		t1.join();
		t2.join();
		
		//Passing now directly in Thread object
		t1=new Thread(()->{
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
		});
		t2=new Thread(()->{
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
		});
		
		t1.start();
		t2.start();
		//Join is used so that until both the threads are completed no other functionality will
		//be called
		t1.join();
		t2.join();
	}
}
