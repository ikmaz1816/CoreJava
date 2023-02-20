package arraysProblem;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int o=sc.nextInt();
		//As the rows and column are not the same.
		int[][] arr1=new int[n][m];
		int[][] arr2=new int[m][o];
		int[][] arr=new int[n][o];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<o;j++)
			{
				arr2[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<o;j++)
			{
				for(int k=0;k<m;k++)
				{
					arr[i][j]+=(arr1[i][k]*arr2[k][j]);
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(Arrays.toString(arr[i]));
		}
		sc.close();
	}

}
