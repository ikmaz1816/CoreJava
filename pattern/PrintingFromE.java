package pattern;

import java.util.Scanner;

public class PrintingFromE {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char p=(char)('A'+n-1);
		int x=0;
		for(int i=0;i<n;i++)
		{
			char c=(char)(p-x);
			for(int j=0;j<=i;j++)
			{
				System.out.print(c);
				c=(char)(c+1);
			}
			x++;
			System.out.println();
		}
		sc.close();
	}

}
