package conditionalstatement;

public class NestedIf {

	public static void main(String[] args) {
		int a=5;
		if(a>2)
		{
			if(a>4)
			{
				if(a>6)
				{
					System.out.println("a is greater than 6");
				}
				else
				{
					System.out.println("a is lesser than or equal to 6");
				}
			}
			else
			{
				System.out.println("a is lesser than or equal to 4");
			}
		}
		else
		{
			System.out.println("a is lesser than or equal to 2");
		}

	}

}
