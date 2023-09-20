package twodimensionalarrayproblems;

public class Main {
	public static void main(String[] args) {
		int[][] arr= {
				{1,2,4},
				{1,2,3},
				{1,7,3}
		};
		
		DiagonalSum diagonal=new DiagonalSum();
		System.out.println(diagonal.diagonalSum(arr));
		
		TransposeOfAMatrix transpose = new TransposeOfAMatrix();
		int[][] ans=transpose.transpose(arr);
		
		for(int[] i : ans)
		{
			for(int j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		UpperTriangularMatrixSum upper=new UpperTriangularMatrixSum();
		System.out.println(upper.upperSum(arr));
		
		LowerTriangularMatrixSum lower = new LowerTriangularMatrixSum();
		System.out.println(lower.lowerSum(arr));
		
	}
}
