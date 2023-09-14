package patterns;

public class TrianglesWithDifferentCharacters {
	public static void main(String[] args) {
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<=i;j++)
			{
				char p=(char)('A'+j);
				System.out.print(p);
			}
			System.out.println();
		}
	}
}
