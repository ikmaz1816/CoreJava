package basicsProblems;

import java.util.Scanner;

public class ProductOfIndividualNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int res=1;
		int n=sc.nextInt();
		while(n>0)
		{
			res+=n%10;
			n/=10;
		}
		System.out.println(res);
		sc.close();

	}

}
