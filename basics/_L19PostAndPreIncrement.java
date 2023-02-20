package basics;

import java.util.Scanner;

public class _L19PostAndPreIncrement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		
		a++;//Increments the value in the next execution
		++a;//Increments it on the same line
		a--;
		--a;
		//Same as increment
		System.out.println(a);
		sc.close();
	}

}
