package abstractClassesAndInterface;

interface I1
{
	void disp();
}
interface I2 extends I1
{
	void show();
}
class Extend implements I2
{
	public void show()
	{
		System.out.println("show");
	}
	public void disp()
	{
		System.out.println("display");
	}
	//In this case both the methods are to be overriden or else it will give error
}
public class InterfaceExtends {

	public static void main(String[] args) {
		Extend e=new Extend();
		e.disp();
		e.show();
	}

}
