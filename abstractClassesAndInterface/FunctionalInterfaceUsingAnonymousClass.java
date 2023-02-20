package abstractClassesAndInterface;

interface Sum
{
	int sum(int a,int b);
}
//This can be done but we can do it more efficiently
//class Result implements Sum
//{
//	public int sum(int a ,int b)
//	{
//		return a+b;
//	}
//}
public class FunctionalInterfaceUsingAnonymousClass {

	public static void main(String[] args) {
		//UsingAnonymous Class
		Sum s=new Sum()
				{
			public int sum(int a,int b)
			{
				return a+b;
			}
				};
		System.out.println(s.sum(2, 3));
		
		
	}

}
