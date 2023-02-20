package objectOrientedProgramming;

class Specifier
{
	private int a;
	//This is private and can only be used in the class where it is declared.
	public int b;
	//Public variables can be used anywhere
	protected int c;
	//Protected variables can be used in the subsiding class
	int d;//nothing means default
	//Default can be used in the package.
	public void display()
	{
		System.out.println(this.a+" "+this.b+" "+this.c+" "+this.d);
	}
}
public class AccessSpecifier {

	public static void main(String[] args) {
		Specifier s=new Specifier();
		s.display();

	}

}
