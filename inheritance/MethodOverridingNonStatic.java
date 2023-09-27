package inheritance;

class C
{
	public void display()
	{
		System.out.println("In display C");
	}
}
class D extends C
{
	/*
	 	D extends C which has a method display and it also has a display method
	 	So it will have a different implementation hence we need to override it 
	 */
	@Override
	public void display()
	{
		System.out.println("In display D");
	}
}
public class MethodOverridingNonStatic {
	public static void main(String[] args) {
		/*
		 	Creating object of C and reference of D
		 	This is called as DynamicMethod Dispatch
		 	Non static override methods will be called of D 
		 */
		C d=new D();
		d.display();
	}
}
