package patterns;

public class Printing01 {
	/*
	 	 if it is at the even place then print 1 else 0
	 */
	public static void main(String[] args) {
		boolean flag=true;
		for(int i=0;i<4;i++)
		{
			if(i%2==0)
				flag=true;
			for(int j=0;j<=i;j++)
			{
				if(flag)
				{
					System.out.print("1");
				}
				else
				{
					System.out.print("0");
				}
				flag=!flag;
			}
			System.out.println();
		}
	}
}
