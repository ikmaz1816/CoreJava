package arrays;

import java.util.Scanner;

public class Arrays2D {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		//Initialization (row,column)
		int[][] arr=new int[n][m];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;i++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		//Printing the value
		for(int[] i:arr)
		{
			for(int j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		//Without for each
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;i++)
			{
//				Arrays.fill(arr[j], 2); for filling the the second row with 2 
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
		
	}

}
