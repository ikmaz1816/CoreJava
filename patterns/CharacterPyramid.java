package patterns;

public class CharacterPyramid {
	public static void main(String[] args) {
		for(int i=0;i<5;i++)
		{
			char p=(char)('A'+i);
			for(int j=0;j<5-i-1;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				p=(char)('A'+j);
				System.out.print(p);
			}
			int x=i;
			for(int j=i-1;j>=0;j--)
			{
				p=(char)('A'+--x);
				System.out.print(p);
			}
			System.out.println();
		}
	}
}
