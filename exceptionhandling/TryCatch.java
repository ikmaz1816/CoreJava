package exceptionhandling;

public class TryCatch {
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
	}
	public static void main(String[] args) {
		divide(2,0);
	}
}
