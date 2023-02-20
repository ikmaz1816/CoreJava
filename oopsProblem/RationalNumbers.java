package oopsProblem;

public class RationalNumbers {
	int numerator;
	int denominator;
	public RationalNumbers(int n,int d)
	{
		numerator=n;
		denominator=d;
	}
	public int gcd(int a ,int b)
	{
		if(a==0)
			return b;
		return gcd(b%a,a);
	}
	public void simplify()
	{
		int divisor=gcd(numerator,denominator);
		this.numerator/=divisor;
		this.denominator/=divisor;
	}
	public void print()
	{
		System.out.println(this.numerator+"/"+this.denominator);
	}
	public void add(RationalNumbers F)
	{
		this.numerator=this.numerator * F.denominator;
		F.numerator=F.numerator * this.denominator;
		this.denominator=this.denominator * F.denominator;
		this.numerator+=F.numerator;
		simplify();
		print();
	}
	public void sub(RationalNumbers F)
	{
		this.numerator=this.numerator * F.denominator;
		F.numerator=F.numerator * this.denominator;
		this.denominator=this.denominator * F.denominator;
		this.numerator-=F.numerator;
		simplify();
		print();
	}
	public void multiply(RationalNumbers F)
	{
		this.numerator*=F.numerator;
		this.denominator*=F.denominator;
		simplify();
		print();
	}
	public void divide(RationalNumbers F)
	{
		this.numerator = this.numerator * F.denominator;
		this.denominator=this.denominator * F.numerator;
		simplify();
		print();
	}
	public static void main(String[] args) {
		RationalNumbers r=new RationalNumbers(2,3);
//		r.add(new RationalNumbers(2,3));
//		r.sub(new RationalNumbers(4,5));
		r.divide(new RationalNumbers(4,9));
	}

}
