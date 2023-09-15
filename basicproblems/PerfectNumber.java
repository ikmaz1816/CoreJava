package basicproblems;

import java.util.Scanner;

public class PerfectNumber {
	//A number is said to be perfect if it has divisor equals to the sum
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		if(sum==n)
			System.out.println("Perfect Number");
		else
			System.out.println("Not Perfect");
		sc.close();
	}
}
