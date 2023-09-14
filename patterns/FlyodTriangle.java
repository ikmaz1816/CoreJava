package patterns;

public class FlyodTriangle {
	public static void main(String[] args) {
		int x=1;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(x++);
			}
			System.out.println();
		}
	}
}
