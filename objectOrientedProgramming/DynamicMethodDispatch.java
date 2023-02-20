package objectOrientedProgramming;

class Dynamic
{
	public void disp()
	{
		System.out.println("I am in dynamic disp");
	}
	public static void display()
	{
		System.out.println("I am in dynamic display");
	}
}
class Method extends Dynamic
{
	public void disp()
	{
		System.out.println("I am in method disp");
	}
	public static void display()
	{
		System.out.println("I am in method display");
	}
}
public class DynamicMethodDispatch {

	public static void main(String[] args) {
		Dynamic d=new Method();
		//The new keyword is used to allocate memory to the new object
		//Dynamic d is the object instantion is no new is assiged then it is null
		
		//In this all the non static fields of child class is called and static fields which are overriden are called from the parent class
		d.disp();
		d.display();
	}

}
