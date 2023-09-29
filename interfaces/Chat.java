package interfaces;

public interface Chat {
	/*
	 	All methods declared inside an interface without implementation are public abstract
	 	variables are final
	 	interface can have static and default methods 
	 	No private methods
	 	There are three types of interfaces 
	 	Functional-> Single public abstract  
	 	Marker-> Serializable
	 	Normal-> Having two or more public abstract
	 */
	static int add(int a,int b)
	{
		return a+b;
		/*
		 	Static methods are called with the interface name
		 */
	}
	default int sub(int a,int b)
	{
		return a-b;
	}
	void sendMessage(String message);
	
	void receiveMessage(String message);
	/*
	 	This interface will be implementated by some class
	 */
}
