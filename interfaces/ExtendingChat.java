package interfaces;

public interface ExtendingChat extends Chat{
	
	void addUser(int userid);
	/*
	 	We can extend two or more interfaces
	 	As in interface the methods are not implementated and hence can be overriden in the 
	 	implementing class
	 	This also solves the diamond problem
	 */

}
