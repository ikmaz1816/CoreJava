package pattern;

import java.util.Scanner;

public class FloydAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char p='A';
		int x=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				char c=(char)(p+x++);
				System.out.print(c+" ");
			}
			System.out.println();
		}
		sc.close();

	}

}
