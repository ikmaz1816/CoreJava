package inputs;

import java.util.Scanner;

public class ScannerInput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		float f=sc.nextFloat();
		double d=sc.nextDouble();
		char c=sc.next().charAt(0);
		long l=sc.nextLong();
		
		System.out.println(a+" "+f+" "+d+" "+c+" "+l);
		sc.close();
	}
}
