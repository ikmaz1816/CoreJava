package basicproblems;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n>0)
		{
			int sum=a+b;
			System.out.println(sum);
			a=b;
			b=sum;
			n--;
		}
		sc.close();
		
	}
}
