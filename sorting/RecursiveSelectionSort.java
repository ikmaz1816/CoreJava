package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class RecursiveSelectionSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		selectionSort(arr,n,0,0);
		System.out.println(Arrays.toString(arr));
		sc.close();
	}

	private static void selectionSort(int[] arr, int r, int c, int max) {
		if(r==0)
			return;
		if(r>c)
		{
			if(arr[c]>arr[max])
			{
				selectionSort(arr,r,c+1,c);
			}
			else
				selectionSort(arr,r,c+1,max);
		}
		else
		{
			int temp=arr[max];
			arr[max]=arr[r-1];
			arr[r-1]=temp;
			selectionSort(arr,r-1,0,0);
		}
		
	}

}
