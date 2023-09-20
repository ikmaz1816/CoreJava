package twodimensionalarrayproblems;

public class TransposeOfAMatrix {
	public int[][] transpose(int[][] arr)
	{
		int row=arr.length;
		int column=arr[0].length;
		int[][] transpose=new int[row][column];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				transpose[j][i]=arr[i][j];
			}
		}
		return transpose;
	}
}
