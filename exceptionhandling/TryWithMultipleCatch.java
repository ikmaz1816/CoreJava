package exceptionhandling;

public class TryWithMultipleCatch {
	public static void divide(int a,int b) 
	{
		try
		{
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			/*
			 We have to write at the end so any exception that is not caught will be caught
			 in this block
			 Also we cannot write it above any other block as it is a parent block
			 */
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		divide(2,0);
	}
}
