package inheritance;

class E
{
	public static void display()
	{
		System.out.println("In display C");
	}
}
class F extends E
{
	/*
	 	D extends C which has a method display and it also has a display method
	 	So it will have a different implementation hence we need to override it 
	 */
	public static void display()
	{
		System.out.println("In display D");
	}
}
public class MethodOverridingStatic {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		/*
		 	Creating object of C and reference of D
		 	This is called as DynamicMethod Dispatch
		 	static override methods will be called of C
		 	Static methods are annotated with overriden method
		 */
		E e=new F();
		e.display();
	}
}
