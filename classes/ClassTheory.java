package classes;

public class ClassTheory {
	public static void main(String[] args) {
		/*
		 	A class is an user defined data type
		 	A class is defined in such a way that it is reusable, extendable and also completes
		 	the sole purpose of its implementation
		 	
		 	With the class we can create copies and these are called as Objects
		 	Objects are instance of class which means they are copies that dont affect the class
		 	directly
		 	Any change made to the copy will not affect the original one
		 	In a class all variables are considered as attributes and functions as methods
		 */
		
		//ClassTheory is also a call and can be instantiated 
		ClassTheory ct=new ClassTheory();
		System.out.println(ct);
		System.out.println(ct.hashCode());
		//both are the same and perform the same functionality 
		//Hashcode is nothing but the hash value generated of a class
		
	}
}
