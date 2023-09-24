package oops;

public class Encapsulation {
	/*
	  Encapsulation is a technique of binding all the necessary data to our respective class
	  
	 */
	private int id;
	private String name;
	
	//This keyword is used to differentiate between class variable and local variable
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getId()
	{
		return this.id;
	}
	public String getName()
	{
		return this.name;
	}
}
