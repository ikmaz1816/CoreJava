package threading;

public class ThreadingWithLambda {

	public static void main(String[] args) throws Exception{
		Runnable r=()->
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Hello");
			}
		};
		Thread t1=new Thread(r);
		t1.start();
		t1.join();
	}

}
