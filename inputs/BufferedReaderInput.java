package inputs;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderInput {
	/*
	 	 it is used to deal with files
	 	 it throws IO Exception
	 */
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		
		int a=Integer.parseInt(br.readLine());
		System.out.println(s+" "+a);
	}
}	
