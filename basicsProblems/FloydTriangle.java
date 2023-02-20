package basicsProblems;

import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int c=0;
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(c+++" ");
			}
			System.out.println();
		}
		sc.close();

	}

}
