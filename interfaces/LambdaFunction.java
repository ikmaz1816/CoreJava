package interfaces;

public class LambdaFunction {
	public static void main(String[] args) {
		Add add=(a,b)-> a+b;
		
		System.out.println(add.add(2, 3));
	}
}
