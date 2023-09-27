package inheritance;

class A
{
	public void display()
	{
		System.out.println("Hello World");
	}
}
class B extends A
{
	/*
	 	As B is extending A it has all the properties of A and can be called through A
	 */
}
public class SingleLevel {
	public static void main(String[] args) {
		B b=new B();
		b.display();
	}
}
