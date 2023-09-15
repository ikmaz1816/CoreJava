package basicproblems;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean flag=false;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				flag=true;
				break;
			}
		}
		if(flag)
			System.out.println("Not a prime Number");
		else
			System.out.println("Prime");
		sc.close();
	}
}
