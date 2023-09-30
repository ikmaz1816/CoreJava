package exceptionhandling;

public class Throws {
	public static int add(int a,int b) throws Exception
	{
		if(b==0)
			throw new CustomException("Not divisible by zero");
		return a+b;
	}
	public static void main(String[] args) throws Exception{
		/*
		  If any method is throwing exception and then it is to handled in the method where
		  it is called
		 */
		System.out.println(add(2,0));
	}
}
