package generics;

public class ClassWithTwoGeneric<T,S> {
	/*
	 	A class is said to be generic if it can be used by any other data type
	 */
	private T first;
	private S second;
	
	public void setFirst(T first)
	{
		this.first=first;
	}
	
	public T getFirst()
	{
		return this.first;
	}
	public void setSecond(S second)
	{
		this.second=second;
	}
	
	public S getSecond()
	{
		return this.second;
	}
	
}
