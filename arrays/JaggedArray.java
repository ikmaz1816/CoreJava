package arrays;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] arr=new int[n][];
		//Now intializing the length of each column
		for(int i=0;i<n;i++)
		{
			arr[i]=new int[i+1];
		}
		//Varying column size arrays are called as jagged array
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		sc.close();
	}

}
