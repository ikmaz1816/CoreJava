package array;

import java.util.Scanner;

public class JaggedArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		//When during runtime we dont initialize any value for columns
		
		int[][] arr=new int[n][];
		
		int rowlength=arr.length;
		
		for(int i=0;i<rowlength;i++)
		{
			arr[i]=new int[i+1];
		}
		
		for(int i=0;i<rowlength;i++)
		{
			int column=arr[i].length;
			for(int j=0;j<column;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<rowlength;i++)
		{
			int column=arr[i].length;
			for(int j=0;j<column;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
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
