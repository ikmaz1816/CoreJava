package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		mergesort(arr,0,n);
		System.out.println(Arrays.toString(arr));
		sc.close();
	}

	private static void mergesort(int[] arr, int start, int end) {
		if(end-start==1)
			return;
		int mid=start+(end-start)/2;
		mergesort(arr,start,mid);
		mergesort(arr,mid,end);
		merge(arr,start,mid,end);
		
	}

	private static void merge(int[] arr, int start, int mid, int end) {
		int i=start;
		int j=mid;
		int k=0;
		int[] arr1=new int[end-start];
		while(i<mid && j<end)
		{
			if(arr[i]>arr[j])
			{
				arr1[k]=arr[j++];
			}
			else
			{
				arr1[k]=arr[i++];
			}
			k++;
		}
		while(i<mid)
		{
			arr1[k++]=arr[i++];
		}
		while(j<end)
		{
			arr1[k++]=arr[j++];
		}
		for(int u=0;u<arr1.length;u++)
		{
			arr[u+start]=arr1[u];
		}
		
	}

}
