package arraysProblem;

import java.util.Arrays;
import java.util.Scanner;

public class UpperAndLowerMatrixSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] arr =new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		int sumUpper=0,sumDiagonal=0,sumLower=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(i==j)
					sumDiagonal+=arr[i][j];
				else if(i>j)
					sumLower+=arr[i][j];
				else
					sumUpper+=arr[i][j];
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(Arrays.toString(arr[i]));
		}
		System.out.println(sumUpper+" "+sumLower+" "+sumDiagonal);
		sc.close();

	}

}
