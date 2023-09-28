package abstractclasses;

public abstract class Chat {
	/*
	 	Abstract class is used for defining some implemetations that are later implementated
	 	by some other class
	 	
	 	If constructor are used then it is called with the help of the child class constructor
	 */
	String name;
	int id;
	
	public Chat(int id,String name)
	{
		this.name=name;
		this.id=id;
	}
	
	public abstract void sendMessage(String message);
	
	public abstract void receiveMessage(String message);
}
