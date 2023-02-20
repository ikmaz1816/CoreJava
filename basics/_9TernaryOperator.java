package basics;

public class _9TernaryOperator {

	public static void main(String[] args) {
		int a=5;
		int b=3;
		
		int c= a>b ? a:b;
		
		String s = a>b ? "a is greater" : "b is greater";
		
		System.out.println(c+" that is "+s);

	}

}
