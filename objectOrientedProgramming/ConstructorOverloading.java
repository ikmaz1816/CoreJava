package objectOrientedProgramming;

public class ConstructorOverloading {
	//By default we have a constructor and it is called during object instantiation
	//Hence this type of constructor is called as default constructor
	public ConstructorOverloading()
	{
		System.out.println("I have no arguments");
	}
	public ConstructorOverloading(int a)
	{
		System.out.println("I have one argument");
	}
	//These are parameterized constructor
	public ConstructorOverloading(int a,int b)
	{
		System.out.println("I have two arguments");
	}
	public static void main(String[] args) {
		ConstructorOverloading co=new ConstructorOverloading(1,2);
	}

}
