package objectOrientedProgramming;

public class MethodOverloading {
	public int add(int a,int b)
	{
		return a+b;
	}
	public static int add(int a)
	{
		return a+5;
	}
	public static int add(int a,int b,int c)
	{
		return a+b+c;
	}
	public static void main(String[] args) {
		MethodOverloading mo=new MethodOverloading();
		System.out.println(mo.add(2, 3));
		System.out.println(MethodOverloading.add(3));
		System.out.println(MethodOverloading.add(2, 3, 4));
	}
}
