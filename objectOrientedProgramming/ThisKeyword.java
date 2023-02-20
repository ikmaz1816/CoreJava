package objectOrientedProgramming;

public class ThisKeyword {
	public int a;
	//This keyword is used to reference the class variables.If the arguments have the same name then it acts as a differentiating factor.
	public ThisKeyword(int a)
	{
		this.a=a;
	}
	public static void main(String[] args) {
		ThisKeyword tk=new ThisKeyword(5);
		System.out.println(tk.a);
	}
}
