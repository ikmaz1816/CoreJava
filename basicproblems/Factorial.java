package basicproblems;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int res=1;
		while(n>0)
		{
			res*=n;
			n--;
		}
		System.out.println(res);
		sc.close();
	}
}
