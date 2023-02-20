package exceptionHandling;

import java.util.Scanner;

public class ThrowUserDefinedException {

	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		try
		{
			//You can write it here as well
//			if(m==0)
//				throw new AyaanException("Not divisible");
			int c=n/m;
			System.out.println(c);
		}
		catch(Exception e)
		{
			throw new AyaanException("Not divisible");
		}
		finally
		{
			sc.close();
		}

	}

}
