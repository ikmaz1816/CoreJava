package patterns;

public class InvertedDifferentCharacterTriangle {
	public static void main(String[] args) {
		for(int i=3;i>=0;i--)
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
