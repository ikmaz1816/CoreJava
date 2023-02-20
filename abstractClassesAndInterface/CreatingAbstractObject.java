package abstractClassesAndInterface;

//If there is even one abstract function the class is considered to be abstract.
abstract class Sample
{
	public abstract void disp();
}
//The abstract methods are to be overriden by the class that extends the abstract class 
class Sample1 extends Sample
{
	public void disp()
	{
		System.out.println("Hello");
	}
}
public class CreatingAbstractObject {

	public static void main(String[] args) {
		Sample1 s=new Sample1();
		s.disp();
	}
}
