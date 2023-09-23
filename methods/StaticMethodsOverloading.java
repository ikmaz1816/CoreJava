package methods;

public class StaticMethodsOverloading {
	
	/*
	 	Method Overloading is a concept where we can have the same method name but with different
	 	arguments 
	 */
	static void add(int a)
	{
		System.out.println(a);
	}
	static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	static void add()
	{
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		add(2,3);
		add();
		add(2);
	}
}
