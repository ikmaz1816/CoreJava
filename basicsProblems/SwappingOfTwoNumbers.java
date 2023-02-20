package basicsProblems;

import java.util.Scanner;

public class SwappingOfTwoNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		// 1st methos
		int temp=a;
		a=b;
		b=temp;
		
		//2nd method
		a+=b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b);
		
		a=a^b;
		b=a^b;
		a=a^b;
		
		System.out.println(a+" "+b);
		sc.close();

	}

}
