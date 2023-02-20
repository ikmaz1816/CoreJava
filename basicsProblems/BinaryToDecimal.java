package basicsProblems;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int res=0,i=0;
		while(n>0)
		{
			int r=n%10;
			res += r * Math.pow(2, i);
			n/=10;
			i++;
		}
		System.out.println(res);
		sc.close();
	}

}
