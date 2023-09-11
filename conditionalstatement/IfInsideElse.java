package conditionalstatement;

public class IfInsideElse {
	public static void main(String[] args) {
		int a=0;
		if(a==0)
		{
			System.out.println("Zero");
		}
		else
		{
			if(a%2==0)
			{
				System.out.println("Even");
			}
			else
			{
				System.out.println("Odd");
			}
		}
	}
}
