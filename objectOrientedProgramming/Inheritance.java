package objectOrientedProgramming;

class Parent
{
	public void disp()
	{
		System.out.println("display");
	}
}
class Child extends Parent
{
	public void show()
	{
		System.out.println("show");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		Child c=new Child();
		//Now c will have the properties of child and parent both.As c is the object of child and child has extended the parent class
		c.disp();
		c.show();
		//Java supports single ,multilevel but not multiple.
	}

}
