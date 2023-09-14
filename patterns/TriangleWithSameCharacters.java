package patterns;

public class TriangleWithSameCharacters {
	public static void main(String[] args) {
		for(int i=0;i<4;i++)
		{
			char p=(char)('A'+i);
			for(int j=0;j<=i;j++)
			{
				System.out.print(p);
			}
			System.out.println();
		}
	}
}
