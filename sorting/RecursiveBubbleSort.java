package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class RecursiveBubbleSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		bubbleSort(arr,n-1,0);
		System.out.println(Arrays.toString(arr));
		sc.close();
	}

	private static void bubbleSort(int[] arr, int r, int c) {
		if(r==0)
			return;
		if(r>c)
		{
			if(arr[c]>arr[c+1])
			{
				int temp=arr[c];
				arr[c]=arr[c+1];
				arr[c+1]=temp;
			}
			bubbleSort(arr,r,c+1);
		}
		else
			bubbleSort(arr,r-1,0);
	}

}
