package classes;

public class ClassWithStaticAndNonStatic {
	/*
	 	Static methods of the class are affected by different objects but non static are only
	 	part of the objects
	 */
	static int id;
	
	int id1;
	
	static
	{
		//Static block are used to initialize the static variables
		id=0;
	}
	public ClassWithStaticAndNonStatic()
	{
		//A constructor is used to initialize the objects
		id1=0;
	}
	public void increment()
	{
		id++;
		id1++;
	}
	public static void main(String[] args) {
		ClassWithStaticAndNonStatic cs1=new ClassWithStaticAndNonStatic();
		ClassWithStaticAndNonStatic cs2=new ClassWithStaticAndNonStatic();
		cs1.increment();
		cs2.increment();
		System.out.println(cs1.id1);
		System.out.println(cs2.id1);
		
		//Static variables are called with the class name
		System.out.println(ClassWithStaticAndNonStatic.id);
	}
}
