package exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResource {
	public static int add() throws IOException
	{
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in)))
		{
			int a=Integer.parseInt(br.readLine());
			int b=Integer.parseInt(br.readLine());
			return a+b;
		}
	}
	public static void main(String[] args) throws Exception{
		System.out.println(add());
	}
}
