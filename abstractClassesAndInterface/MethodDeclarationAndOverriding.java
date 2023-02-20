package abstractClassesAndInterface;

//In abstract classes we can have non static and static methods
abstract class A
{
	public abstract void disp();
	public void show()
	{
		System.out.println("show");
	}
	public static void display()
	{
		System.out.println("display in A");
	}
}
class B extends A
{
	public void disp()
	{
		System.out.println("disp");
	}
	@Override
	public void show()
	{
		System.out.println("show in B");
	}
	public static void display()
	{
		System.out.println("display in B");
	}
}
public class MethodDeclarationAndOverriding {

	public static void main(String[] args) {
		//Dynamic Method Dispatch
		A a=new B();
		a.disp();
		a.show();
		a.display();
	}

}
