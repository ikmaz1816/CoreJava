package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		quicksort(arr,0,n-1);
		System.out.println(Arrays.toString(arr));
		sc.close();

	}

	private static void quicksort(int[] arr, int start, int end) {
		if(start<end)
		{
			int pivot=partition(arr,start,end);
			quicksort(arr,start,pivot-1);
			quicksort(arr,pivot+1,end);
		}
		
	}

	private static int partition(int[] arr, int start, int end) {
		int count=start-1;
		int pivot=arr[end];
		for(int i=start;i<end;i++)
		{
			if(arr[i]<pivot)
			{
				count++;
				int temp=arr[count];
				arr[count]=arr[i];
				arr[i]=temp;
			}
		}
		count++;
		int temp=arr[count];
		arr[count]=arr[end];
		arr[end]=temp;
		return count;
	}

}
