package arraysProblem;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int key=sc.nextInt();
		Arrays.sort(arr);
		int start=0;
		int end=arr.length-1;
		sc.close();
		while(start<=end)
		{
			int mid=start + (end-start)/2;
			if(arr[mid]==key)
			{
				System.out.println("Element Found At "+mid);
				return;
			}
			else if(arr[mid]>key)
				end=mid-1;
			else
				start=mid+1;
		}
		System.out.println("Element not found");
	}

}
