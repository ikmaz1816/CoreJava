package loops;

public class NestedFor {
	public static void main(String[] args) {
		/*
		 	for loop inside a for loop is called as nested for and is used for 2d based problems
		 */
		//Let us build a pattern 
		int i=0;
		while(i<4)
		{
			int j=0;
			while(j<4)
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
