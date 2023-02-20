package oopsProblem;

public class ComplexNumber {
	private int real;
	private int imaginary;
	public ComplexNumber(int r,int i)
	{
		this.real=r;
		this.imaginary=i;
	}
	public void print()
	{
		if(this.imaginary>0)
			System.out.println(this.real+"+"+this.imaginary+"i");
		else
			System.out.println(this.real+""+this.imaginary+"i");
	}
	public void add(ComplexNumber c)
	{
		this.real=this.real+c.real;
		this.imaginary+=c.imaginary;
		print();
	}
	public void sub(ComplexNumber c)
	{
		this.real=this.real-c.real;
		this.imaginary-=c.imaginary;
		print();
	}
	public void multiply(ComplexNumber c)
	{
		int value=this.real * c.real - this.imaginary * c.imaginary;
		this.imaginary =this.real * c.imaginary + this.imaginary * c.real;
		this.real=value;
		print();
	}
	public static void main(String[] args) {
		ComplexNumber cn=new ComplexNumber(2,3);
		cn.multiply(new ComplexNumber(3,6));
	}

}
