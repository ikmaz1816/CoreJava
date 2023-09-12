package operator;

public class ArithematicOperator {
	public static void main(String[] args) {
		int a=5;
		int b=6;
		/*
		  In case of arithematic operator the output depends on operands 
		  
		  int output=int + double
		  This will give double as data type output as double has higher precedence 
		  hence we need to typecase
		 */
		
		System.out.println(a+b);
		
		System.out.println(a-b);
		
		System.out.println(a*b);
		
		//This returns the quotient
		System.out.println(a/b);
		
		//This returns the remainder
		System.out.println(a%b);
	}
}
