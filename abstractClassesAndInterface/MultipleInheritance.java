package abstractClassesAndInterface;
interface first
{
	void disp();
	public static void show()
	{
		System.out.println("show");
	}
}
interface second
{
	void disp();
	public static void show()
	{
		System.out.println("show");
	}
}
class FS implements first,second
{
	public void disp()
	{
		System.out.println("display");
	}
	
}
public class MultipleInheritance {

	public static void main(String[] args) {
		//There is still diamond problem
		//Hence you can call the methods with the interface name;

	}

}
