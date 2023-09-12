package operator;

public class BitwiseOperators {
	public static void main(String[] args) {
		int a =5 ;
		int b=4;
		
		/*
		 	 bitwise operators are actually performed on bits 
		 	 1 0 1 -> 5
		 	 1 0 0 -> 4
		 	 | -> Any one bit to be high
		 	 &-> All the bits to be high
		 	 ~a=-(a+1)
		 	 ^->any one to be high 
		 	 >> -> left shift the bits
		 	 << -> right shift the bits
		 */
		
		System.out.println(a|b);
		System.out.println(a&b);
		System.out.println(a^b);
		System.out.println(~b);
		System.out.println(a>>1);// shift bits by 1 left
		System.out.println(a<<1);
	}
}
