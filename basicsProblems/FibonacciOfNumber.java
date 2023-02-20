package basicsProblems;

import java.util.Scanner;

public class FibonacciOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int a=0;
		int b=1;
		for(int i=1;i<n-1;i++)
		{
			int sum=a+b;
			System.out.println(sum);
			a=b;
			b=sum;
		}
		sc.close();
	}

}
