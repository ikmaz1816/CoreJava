package pattern;

import java.util.Scanner;

public class ReversePyramid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n-1;i>=0;i--)
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
