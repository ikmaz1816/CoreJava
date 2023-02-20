package objectOrientedProgramming;

public class Vargs {
	public static int add(int ...i)
	{
		//Variable length argument -.kwargs
		//The numbers are taken in the form of array and stored in a variable i.e int this way ...variable_name
		int sum=0;
		for(int a:i)
		{
			sum+=a;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(add(1,2,3,4,5,6,7));
		System.out.println(add(1,2,3,4));
	}

}
