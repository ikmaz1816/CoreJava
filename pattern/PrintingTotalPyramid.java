package pattern;

import java.util.Scanner;

public class PrintingTotalPyramid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=n;
		int n2=n-1;
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j<n-i-1)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			for(int j=i;j>0;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n2-1;i>=0;i--)
		{
			for(int j=0;j<n;j++)
			{
				if(j<n-i-1)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			for(int j=i;j>0;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();

	}

}
