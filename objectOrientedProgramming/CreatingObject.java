package objectOrientedProgramming;

import java.util.Scanner;

class Calculator
{
	private int a;
	private int b;
	private Scanner sc;
	public Calculator(int a,int b)
	{
		setA(a);
		setB(b);
		sc=new Scanner(System.in);
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
	public void operations()
	{
		while(true)
		{
			System.out.println("Please enter the operation you want to perform in characters");
			char c=sc.next().charAt(0);
			int sum=0;
			switch(c)
			{
			case '+':
				
				sum=this.a+this.b;
				System.out.println(sum);
				break;
			case '-':
				sum=this.a-this.b;
				System.out.println(sum);
				break;
			default:
				System.out.println("No operation of the specified character");
			}
			String yes=sc.next();
			if(yes.equalsIgnoreCase("no"))
				break;
		}
	}
}
public class CreatingObject {

	public static void main(String[] args) {
		//Class is an user defined data type.
		//Object are the instance of the class
		//They act as the blueprint for the class
		Calculator c=new Calculator(3,5);
		//Objects are stored in the heap memory and static methods and classes are stored  in the method area
		//Hence we can use static objects without instantiation.
		c.operations();

	}

}
