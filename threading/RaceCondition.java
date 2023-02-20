package threading;

class Race
{
	int a=0;
	public synchronized void increment()
	{
		a++;
	}
}
public class RaceCondition {

	public static void main(String[] args) throws Exception{
		Race r=new Race();
		Thread t1=new Thread(()->
		{
			for(int i=0;i<1000;i++)
			{
				r.increment();
			}
		});
		Thread t2=new Thread(()->
		{
			for(int i=0;i<1000;i++)
			{
				r.increment();
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(r.a);
	}

}
