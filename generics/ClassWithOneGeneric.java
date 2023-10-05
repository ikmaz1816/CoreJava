package generics;

public class ClassWithOneGeneric<T> {
	/*
	 	A class is said to be generic if it can be used by any other data type
	 */
	private T id;
	
	public void setId(T id)
	{
		this.id=id;
	}
	
	public T getId()
	{
		return this.id;
	}
	
}
