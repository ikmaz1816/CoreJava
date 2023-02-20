package basicsProblems;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		// 121 ->121
		int n1=n;
		int reverse=0;
		while(n>0)
		{
			reverse=reverse * 10 + n%10;
			n/=10;
		}
		if(reverse==n1)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
		sc.close();

	}

}
