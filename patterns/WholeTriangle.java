package patterns;

public class WholeTriangle {
	public static void main(String[] args) {
		/*
	 	If any input is given then use that input
	 	n1-> triangle
	 	n2->Inverted triangle
	 	n1=n>>1 + 1;
	 	n2=n>>1
	 */
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=3;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
