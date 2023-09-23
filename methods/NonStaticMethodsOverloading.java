package methods;

public class NonStaticMethodsOverloading {
	
	/*
	 	Method Overloading is a concept where we can have the same method name but with different
	 	arguments 
	 */
	public void add(int a)
	{
		System.out.println(a);
	}
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public void add()
	{
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		NonStaticMethodsOverloading overloading =new NonStaticMethodsOverloading();
		overloading.add();
		overloading.add(2);
		overloading.add(2, 3);
	}
}
