package objectOrientedProgramming;
class Parent1
{
	public Parent1()
	{
		System.out.println("I am in parent1");
	}
	public Parent1(int a)
	{
		System.out.println("I have one argument");
	}
	public void disp()
	{
		System.out.println("Hello");
	}
}
class Child1 extends Parent1
{
	public Child1()
	{
//		super();
//		Even if you dont write there is still a super by default
		// Is you want to call the constructor with argument then you have to specify super with the number of argument
		//In this case the default constructor will not be called
		super(1);
		System.out.println("I am in child1");
		//You can also call methods with the super keyword.Both parameterized and non parameterized
		super.disp();
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
		Child1 c=new Child1();
		//This will call both the constructor
	}

}
