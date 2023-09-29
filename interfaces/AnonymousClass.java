package interfaces;

public class AnonymousClass {
	public static void main(String[] args) {
		Add add=new Add()
				{
					public int add(int a,int b)
					{
						return a+b;
					}
				};
		System.out.println(add.add(2, 3));
	}
}
