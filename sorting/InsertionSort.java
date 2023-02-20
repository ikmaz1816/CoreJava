package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		insertionSort(arr,n);
		System.out.println(Arrays.toString(arr));
		sc.close();
	}

	private static void insertionSort(int[] arr, int n) {
		for(int i=1;i<n;i++)
		{
			int temp=arr[i];
			int j=i;
			for(;j>0 && temp<arr[j-1];j--)
			{
				arr[j]=arr[j-1];
			}
			arr[j]=temp;
		}
		
	}

}
