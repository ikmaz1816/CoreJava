package basicproblems;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int n1=n;
		while(n>0)
		{
			sum+=Math.pow(n%10, 3);
			n/=10;
		}
		if(sum==n1)
			System.out.println("Armstrong");
		else
			System.out.println("Not armstrong");
		sc.close();
	}
}
