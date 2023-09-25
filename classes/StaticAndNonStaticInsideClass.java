package classes;

public class StaticAndNonStaticInsideClass {
	
	static class Inner
	{
		public void display()
		{
			System.out.println("In display static");
		}
	}
	class Inner1
	{
		public void display()
		{
			System.out.println("In display non static");
		}
	}
	public static void main(String[] args) {
		StaticAndNonStaticInsideClass obj=new StaticAndNonStaticInsideClass();
		
		StaticAndNonStaticInsideClass.Inner staticClass=new Inner();
		staticClass.display();
		
		StaticAndNonStaticInsideClass.Inner1 nonStatic=obj.new Inner1();
		nonStatic.display();
	}
}
