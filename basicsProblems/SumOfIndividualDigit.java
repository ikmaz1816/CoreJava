package basicsProblems;

import java.util.Scanner;

public class SumOfIndividualDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int n=sc.nextInt();
		while(n>0)
		{
			sum+=n%10;
			n/=10;
		}
		System.out.println(sum);
		sc.close();
	}

}
