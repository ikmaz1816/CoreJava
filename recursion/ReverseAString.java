package recursion;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(reverse(s," "));
		sc.close();
	}

	private static String reverse(String s, String string) {
		if(s.isEmpty())
		{
			return string;
		}
		char c=s.charAt(0);
		return reverse(s.substring(1),c+string);
	}

}
