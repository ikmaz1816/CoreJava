package arraysProblem;

import java.util.Scanner;

public class SmallestAndLargestElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i:arr)
		{
			max=Math.max(i, max);
			min=Math.min(i, min);
		}
		System.out.println(max+" "+min);
		sc.close();
	}

}
