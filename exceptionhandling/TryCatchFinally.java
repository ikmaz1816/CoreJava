package exceptionhandling;

public class TryCatchFinally {
	public static void divide(int a,int b) 
	{
		try
		{
			System.out.println(a/b);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			/*
			 	This block will be executed even if exception is caught or not caught
			 */
			System.out.println("I am here for some info");
		}
	}
	public static void main(String[] args) {
		divide(2,0);
	}
}
