package oops;

public class PrivateConstructor {
	/*
	 	Private constructor are created for the sole reason of creating only one instance of that
	 	particular class
	 	This can be breaked with the help of reflection
	 */
	static PrivateConstructor pc=new PrivateConstructor();
	private PrivateConstructor()
	{
		
	}
	public PrivateConstructor getInstance()
	{
		return pc;
	}
	public static void main(String[] args) {
		PrivateConstructor ps=PrivateConstructor.pc;
		/*
		 	This is mostly used for singleton objects
		 */
		System.out.println(ps.hashCode());
	}
}
