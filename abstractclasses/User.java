package abstractclasses;

public class User extends Chat{
	
	/*
	 	Now this class extends chat which is an abstract class and also has a constructor hence we need 
	 	to provide those details as well in our constructor
	 */
	public User(int id,String name)
	{
		super(id,name);
	}

	@Override
	public void sendMessage(String message) {
		System.out.println("Sending Message"+" "+message);
		
	}

	@Override
	public void receiveMessage(String message) {
		System.out.println("Receiving Message"+" "+message);
		
	}
	
	public static void main(String[] args) {
		User user=new User(1,"Imran");
		user.sendMessage("Hi");
		user.receiveMessage("Hello");
	}
	
}
