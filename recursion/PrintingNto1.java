package recursion;

import java.util.Scanner;

public class PrintingNto1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		print(n);
		sc.close();
	}

	private static void print(int n) {
		if(n==0)
			return;
		System.out.println(n);
		print(n-1);
	}

}
