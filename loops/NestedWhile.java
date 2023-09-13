package loops;

public class NestedWhile {
	public static void main(String[] args) {
		/*
		 	for loop inside a for loop is called as nested for and is used for 2d based problems
		 */
		//Let us build a pattern 
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
