package strings;

public class StringBasics {
	public static void main(String[] args) {
		/*
		  With Java 8 Strings are stored in two memory locations
		  1) Heaps 
		  2) SCP->String constant pool
		  
		 	Strings are thread safe and are also indexable 
		 	Strings are immutable that is whenever we change a string object a new String
		 	would be created
		 	Hence string can bring memory issues
		 */
		//So when we write
		String s1=new String("Imran");
		//In this two objects will be created one in the heap and other in the SCP that is 
		//Pointed out by the JVM 
		String s2=new String("Imran");
		//Another object will be created in Heap but no object in the SCP as it is pointed by JVM
		String s3="Imran";
		//This will only create an object in SCP but SCP already has one of the same type hence it
		//not create one
		
		//String class overrides the object classes equals method
		//Object class equals method checks for the reference rather than content
		
		if(s1.equals(s3) && s1.equals(s2))
			System.out.println("It is because of the equals method");
		
		/*
		  Now if I write s1+="Hi"
		  
		  If would create another string in the heap area as String are immutable
		  String class is also final
		 */
	}
}
