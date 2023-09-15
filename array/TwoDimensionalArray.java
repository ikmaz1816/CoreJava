package array;

import java.util.Scanner;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		/*
		  Two dimensional array has rows and columns 
		 */
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		int[][] arr=new int[n][m];
		//for rows length
		int rowlength=arr.length;
		
		//for column length
		int column=arr[0].length;
		//Can use only if length is same
		
		for(int i=0;i<rowlength;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<rowlength;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		//We can also change a value at a particular index
		if(n>0 && m>2)
			arr[0][2]=3;
		
		for(int[] i : arr)
		{
			for(int j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
