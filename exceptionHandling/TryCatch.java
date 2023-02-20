package exceptionHandling;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		//If the try block works then the catch block is not executed.In try if an error arises then the flow is directed towrds catch
		//all lines below the error are not executed.
		try
		{
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			//The output will appear in red 
			System.err.println(e);
		}
		sc.close();
	}

}
