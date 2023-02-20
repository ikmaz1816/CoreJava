package threading;

public class MakingAnonymousClass {

	public static void main(String[] args) throws Exception{
		Runnable r=new Runnable()
				{
			public void run()
			{
				for(int i=0;i<5;i++)
				{
					System.out.println("Hello");
				}
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		};
		Thread t1=new Thread(r);
		t1.start();
		t1.join();

	}

}
