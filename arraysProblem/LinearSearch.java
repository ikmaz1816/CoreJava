package arraysProblem;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int key=sc.nextInt();
		sc.close();
		for(int i:arr)
		{
			if(key==i)
			{
				System.out.println("Element Found");
				return;
			}
		}
		System.out.println("Element Not Found");

	}

}
