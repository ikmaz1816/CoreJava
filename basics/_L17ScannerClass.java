package basics;

import java.util.Scanner;

public class _L17ScannerClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		float b=sc.nextFloat();
		double d=sc.nextDouble();
		String s=sc.next();//Termination for this will be space
		String line =sc.nextLine();//Termination for this will be enter
		char c=sc.next().charAt(0);
		System.out.println(a+" "+b+" "+d+" "+s+" "+line+" "+c);
		sc.close();

	}

}
