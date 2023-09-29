package interfaces;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Vehicle implements Cloneable,Serializable{
	private String name;
	private int id;
	public Vehicle() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	/*
	 	Clone is used to clone the object and not pass the original clas
	 	Serializable is used when we want to pass the data over the network and it converts the data
	 	into byteStream
	 */
	public Vehicle clone() throws CloneNotSupportedException
	{
		return (Vehicle)super.clone();
		//Now wherever we want we can just call .clone to pass the clone Object
	}
}
