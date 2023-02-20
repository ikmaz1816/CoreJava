package recursion;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		reverse(arr,0,n-1);
		System.out.println(Arrays.toString(arr));
		sc.close();
	}

	private static void reverse(int[] arr, int i, int j) {
		if(i<j)
		{
			swap(arr,i,j);
			reverse(arr,i+1,j-1);
		}
		
	}

	private static void swap(int[] arr, int i, int j) {
//		arr[i]=arr[i]-(arr[j]=arr[i]);
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}

}
