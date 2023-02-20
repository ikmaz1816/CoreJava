package exceptionHandling;

import java.util.Scanner;

public class TryCatchFinally {

	public static void main(String[] args) throws Exception{
		//Finally is executed everytime
		//It is mostly used for closing resource
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		try
		{
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception e)//Exception is the parent class for all exception
		{
			throw new Exception("Please change your denominator");
		}
		finally
		{
			System.out.println("bye");
			sc.close();
		}

	}

}
