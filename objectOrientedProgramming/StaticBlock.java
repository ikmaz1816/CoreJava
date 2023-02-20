package objectOrientedProgramming;

public class StaticBlock {
	private static int a;
	//Static block is used for initialization of static variables 
	static
	{
		a=5;
	}
	public static void main(String[] args) {
		a+=1;
		System.out.println(a);
	}
}
