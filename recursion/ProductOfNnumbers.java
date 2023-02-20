package recursion;

import java.util.Scanner;

public class ProductOfNnumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(product(n));
		sc.close();

	}

	private static int product(int n) {
		if(n==0)
			return 1;
		return n * product(n-1);
	}
}
