package basics;

public class _5BitwiseOperators {

	public static void main(String[] args) {
		// Or -> If anyone input is true the output is true
		//And -> If both the inputs are true then and only then the output is true
		//Ex_Or-> If one is true and other is false then and only then the output will be true
		//>> ->Shifts the bits to the left
		//<< -> Shifts the bit towards the right
		
		int a=5;
		 
		a= (a&1);
		
		a=(a|1);
		
		a=(a>>1);
		
		a=(a<<1);
		
		a=(a^1);
		
		System.out.println(a);
		

	}

}
