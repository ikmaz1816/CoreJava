package objectOrientedProgramming;

class Inheritance1
{
	public void display()
	{
		System.out.println("I am in Inheritance1");
	}
}
class Inheritance2
{
	public void display()
	{
		System.out.println("I am in Inheritance 2");
	}
}
//class Problem extends Inheritance1,Inheritance2
//{
//	//This will give us an error and the reason is Problem class will face the problem of diamond issue
//	//If we call the display method after object instantiation then the object will not be able to identify which class method to be called.
	//It can be solved using Interfaces only.
//}
public class IssuesWithMultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
