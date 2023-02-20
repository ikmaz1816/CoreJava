package pattern;

import java.util.Scanner;

public class PrintingAplhabetTraingleDifferentReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char p='A';
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				char c=(char)(p+j);
				System.out.print(c+" ");
			}
			System.out.println();
		}
		sc.close();

	}

}
