package arraysProblem;

import java.util.Arrays;
import java.util.Scanner;

public class TransposeOfAMatrix {

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
		int[][] arrT=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				arrT[i][j]=arr[j][i];
			}
		}
		for(int i=0;i<m;i++)
		{
			System.out.println(Arrays.toString(arrT[i]));
		}
		sc.close();
	}

}
