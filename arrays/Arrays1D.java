package arrays;

import java.util.Scanner;

public class Arrays1D {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//size
		int n=sc.nextInt();
		//Initialization
		int[] arr=new int[n];
		//Arrays are zero based indexing 
		for(int i=0;i<n;i++)
		{
			//Assigning value at each index
			arr[i]=sc.nextInt();
		}
		
		//Printing the array
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		//Printing using for each
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
		sc.close();
	}

}
