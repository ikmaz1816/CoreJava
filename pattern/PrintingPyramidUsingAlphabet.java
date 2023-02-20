package pattern;

import java.util.Scanner;

public class PrintingPyramidUsingAlphabet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			char p='A';
			int x=0;
			for(int j=0;j<n;j++)
			{
				if(j<n-i-1)
				{
					System.out.print(" ");
				}
				else
				{
					char c=(char)(p+x++);
					System.out.print(c);
				}
			}
			x-=1;
			for(int j=i;j>0;j--)
			{
				char c=(char)(p+ (--x));
				System.out.print(c);
			}
			System.out.println();
		}
		sc.close();

	}

}
