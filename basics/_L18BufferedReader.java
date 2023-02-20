package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _L18BufferedReader {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		System.out.println(a);
		String s= br.readLine();
		System.out.println(s);
		br.close();
	}

}
