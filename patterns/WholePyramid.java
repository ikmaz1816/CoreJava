package patterns;

public class WholePyramid {
	public static void main(String[] args) {
		/*
		 	If any input is given then use that input
		 	n1-> pyramid
		 	n2->Inverted pyramid
		 	n1=n>>1 + 1;
		 	n2=n>>1
		 */
		for(int i=0;i<5;i++)
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
		for(int i=3;i>=0;i--)
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
