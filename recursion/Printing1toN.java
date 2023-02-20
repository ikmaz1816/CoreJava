package recursion;

import java.util.Scanner;

public class Printing1toN {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		print(n);
		sc.close();
	}

	private static void print(int n) {
		if(n==0)
			return;
		print(n-1);
		System.out.println(n);
		
	}

}
