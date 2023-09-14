package patterns;

public class InvertedPyramid {
	public static void main(String[] args) {
		for(int i=4;i>=0;i--)
		{
			for(int j=0;j<5-i-1;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int j=i-1;j>=0;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
