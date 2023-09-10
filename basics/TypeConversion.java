package basics;

public class TypeConversion {
	public static void main(String[] args) {
		/*
		  Data types are actually types to store specific data
		  int ->Integer
		  long->Big integer
		  
		  So precedence of data types
		  byte>>char>>int>>long>>float>>double
		  
		  to convert byte to int you have to typecast
		  int can store byte and char 
		  double can store all data types 
		  float can store all except double
		  
		  Now to store double in float we need to typecase 
		 */
		
		//DownCasting
		int a='a';
		//Now we can store character in integer as integer has higher precedence
		
		//Upcasting
		char ch = (char)1000000001;
		
		System.out.println(a+" "+ch);
	}
}
