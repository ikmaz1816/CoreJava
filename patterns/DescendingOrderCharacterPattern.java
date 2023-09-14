package patterns;

public class DescendingOrderCharacterPattern {
	public static void main(String[] args) {
		for(int i=0;i<5;i++)
		{
			char p=(char)('A'+4-i);
			for(int j=0;j<=i;j++)
			{
				System.out.print(p);
				p=(char)(p+1);
				
			}
			System.out.println();
		}
	}
}
