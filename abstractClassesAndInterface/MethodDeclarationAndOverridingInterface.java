package abstractClassesAndInterface;

interface Methods
{
	//In interface we can only have static and default methods
	void disp();
	public static void display()
	{
		System.out.println("Hello");
	}
	default void show()
	{
		System.out.println("Show");
	}
}
class MethodImplements implements Methods
{
	public void disp()
	{
		System.out.println("disp");
	}
	
	@Override
	public void show()
	{
		System.out.println("Show in methodimplements");
	}
}
public class MethodDeclarationAndOverridingInterface {

	public static void main(String[] args) {
		Methods m=new MethodImplements();
		m.disp();
		m.show();
		//So the static methods of interface are called by the name of the interface itself as they are defined for some reasons.
		Methods.display();
	}

}
