package basics;

public class _8NestedIf {

	public static void main(String[] args) {
		int a=10;
		
		if(a>5)
		{
			if(a>7)
			{
				if(a>11)
				{
					System.out.println("a is greater then 11");
				}
				else
				{
					if(a==10)
					{
						System.out.println("a is less than 10");
					}
				}
			}
		}

	}

}
