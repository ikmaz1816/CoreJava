package basicsProblems;

import java.util.Scanner;

public class FactorialOfANumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		int res=1;
		int i=a;
		while(i>0)
		{
			res*=i;
			i--;
		}
		System.out.println(res);
		sc.close();

	}

}
