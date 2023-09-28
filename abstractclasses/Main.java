package abstractclasses;

public class Main {
	public static void main(String[] args) {
		Chat chat=new Chat(1,"Zaid")
				{
					public void sendMessage(String message)
					{
						System.out.println("Sending "+message);
					}
					public void receiveMessage(String message)
					{
						System.out.println("Receiving "+message);
					}
				};
				
		chat.sendMessage("Hi");
		chat.receiveMessage("Hello");
	}
}
