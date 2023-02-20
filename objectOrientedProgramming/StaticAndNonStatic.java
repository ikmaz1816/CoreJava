package objectOrientedProgramming;

public class StaticAndNonStatic {
	public static void disp()
	{
		System.out.println("Hi I am static");
	}
	public void show()
	{
		System.out.println("Hi I am non static");
	}
	public static void main(String[] args) {
		StaticAndNonStatic.disp();
		//Static methods are called with the class name but if the main method and static method are in the same class we can 
		//write the name of the method only.
		disp();
		//You can directly call disp as it is static and present in the method area along with the main method
		//On the other hand show has to be called only through object instantiation
		StaticAndNonStatic sn=new StaticAndNonStatic();
		sn.show();
	}

}
