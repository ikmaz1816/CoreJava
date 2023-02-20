package objectOrientedProgramming;

public class InnerClasses {
	
	class Inner
	{
		public void display()
		{
			System.out.println("display");
		}
	}
	static class Inner1
	{
		public void disp()
		{
			System.out.println("disp");
		}
	}
	public static void main(String[] args) {
		InnerClasses ic=new InnerClasses();
		//For nonstatic classes you have to create instantiation using the parent class.
		Inner in=ic.new Inner();
		in.display();
		
		Inner1 in1=new Inner1();
		in1.disp();
	}
}
