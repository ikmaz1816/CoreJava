package exceptionHandling;

import java.util.Scanner;

public class TryWithFinally {

	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		try
		{
			if(m==0)
				throw new Exception("Arithmetic Issue");
			int c=n/m;
			System.out.println(c);
		}
		finally
		{
			sc.close();
		}

	}

}
