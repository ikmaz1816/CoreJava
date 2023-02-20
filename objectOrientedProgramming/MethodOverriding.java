package objectOrientedProgramming;

class Ride
{
	public void disp()
	{
		System.out.println("I am disp");
	}
	public static void display()
	{
		System.out.println("I am display");
	}
}
class Overriden extends Ride
{
	@Override
	public void disp()
	{
		System.out.println("I am override disp");
	}
	public static void display()
	{
		System.out.println("I am override display");
	}
}
public class MethodOverriding {
	public static void main(String[] args) {
		Overriden o=new Overriden();
		o.disp();
		Overriden.display();
		//the nonstatic method is overriden but the static one is not as it is not call by reference but by Class itself.
	}

}
