package methods;

public class MethodBasics {
	
	public void subtract(int a)
	{
		System.out.println(a);
	}
	public static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		/*
		 	So there are some methods which are called directly by the class and there is a single
		 	copy of it -> Static
		 	There are some methods which are replicated by other instances and multiple copies can be 
		 	created 
		 	
		 	Static methods are stored in the method area 
		 	
		 	Non Static methods are stored in the heap area
		 	
		 	The main method is in the method area and object is hence instantiated to be visible to the
		 	main method 
		 	
		 	Static methods are visible to non static as well static 
		 	
		 	Non static are not visible to static and hence can be used only with non static
		 	
		 	To use a non static inside a static we have to instantiate its object and then call that
		 	particular method
		 */
		
		add(2,3);
		MethodBasics mb=new MethodBasics();
		mb.subtract(2);
	}
}
