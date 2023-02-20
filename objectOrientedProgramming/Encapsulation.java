package objectOrientedProgramming;

class Encap
{
	private int a ;
	private int b;
	//Encapsulation is a technique through which we can bind the data together.It encapsules the data.
	public Encap(int a,int b)
	{
		setA(a);
		setB(b);
	}
	private void setA(int a)
	{
		this.a=a;
	}
	public int getA()
	{
		return this.a;
	}
	private void setB(int b)
	{
		this.b=b;
	}
	public int getB()
	{
		return this.b;
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		Encap en=new Encap(3,4);
		System.out.println(en.getA()+" "+en.getB());

	}

}
