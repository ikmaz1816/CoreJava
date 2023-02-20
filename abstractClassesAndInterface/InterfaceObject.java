package abstractClassesAndInterface;

interface C
{
	//In interface by default the methods are considered to be public abstract
	void disp();
	//We have three types of interface
	//Functional-> Only one public abstract method
	//Marker->It is an empty interface and provides a runtime environment for objects
	//Serializable-> Used for conversion of bytecode
}
class ExtendsInterface implements C
{
	@Override
	public void disp()
	{
		System.out.println("Hello");
	}
}
public class InterfaceObject {

	public static void main(String[] args) {
		C s=new ExtendsInterface();
		s.disp();
	}
}
