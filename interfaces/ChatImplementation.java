package interfaces;

public class ChatImplementation implements Chat{
	/*
	 	Chat implementation cannot override the static method but can override the default one
	 */
	static int add(int a,int b)
	{
		return a+b;
	}
	
	@Override
	public int sub(int a,int b)
	{
		return a-b;
	}

	@Override
	public void sendMessage(String message) {
		System.out.println("Sending"+message);
		
	}

	@Override
	public void receiveMessage(String message) {
		System.out.println("Receive"+message);
		
	}
}
