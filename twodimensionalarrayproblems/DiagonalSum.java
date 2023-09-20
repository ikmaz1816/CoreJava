package twodimensionalarrayproblems;

public class DiagonalSum {
	public int diagonalSum(int[][] arr)
	{
		int sum=0;
		int row=arr.length;
		int column=arr[0].length;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				if(i==j)
					sum+=arr[i][j];
			}
		}
		return sum;
	}
}
