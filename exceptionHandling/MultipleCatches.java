package exceptionHandling;

import java.util.Scanner;

public class MultipleCatches {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		//These are all unchecked exception and checked during runtime
		try
		{
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		//This block is written at last if there is no error mentioned in the above catch block then the error is catched here
		//This should also be written at the last
		catch(Exception e)//Exception is the parent class for all exception
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("bye");
			sc.close();
		}

	}

}
