package objectOrientedProgramming;

import java.util.Scanner;

public class FinalKeyword {
	//Some values will never change in a program hence in this case we will use final keyword
	public static final double pi=3.14;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double area = pi * n * n;
		System.out.println(area);
		sc.close();
	}
}
