package pattern;

import java.util.Scanner;

public class PrintingAlphabetTriangleSame {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			char p=(char)(i+'A');
			for(int j=0;j<=i;j++)
			{
				System.out.print(p+" ");
			}
			System.out.println();
		}
		sc.close();

	}

}
