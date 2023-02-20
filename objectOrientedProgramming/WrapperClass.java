package objectOrientedProgramming;

import java.util.Scanner;

public class WrapperClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		//Wrapping or boxing
		Integer i=n;
		System.out.println(i);
		
		//unboxing or unwrapping
		int j=i.intValue();
		System.out.println(j);
		
		sc.close();
	}

}
