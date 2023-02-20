package basicsProblems;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print("2 3 ");
		for(int i=4;i<=n;i++)
		{
			int flag=0;
			for(int j=2;j<=n/2;j++)
			{
				if(i!=j && i%j==0)
				{
					flag=1;
				}
				if(flag==1)
					break;
			}
			if(flag==0)
				System.out.print(i+" ");
		}
		sc.close();

	}

}
