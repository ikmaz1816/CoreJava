package string;

public class StringBasic {

	public static void main(String[] args) {
		// In string we have the SCP->String constant pool and heap memory
		//The heap memory is used to store the objects
		//String is thread safe
		//When you declare:-
		String s="Imran";
		//Then Imran will be created in SCP only
		
		//When we create object it is created in heap and SCP and internally pointed by JVM itself
		String s1=new String("Imran");
		
		//Now we have the object class which string overrides as the basic equal object check for reference and not content
		System.out.println(s1==s);//false
		
		System.out.println(s1.equals(s));//true
		
		//String are mutable and are thread safe
		//Commonly used functions
		
		System.out.println(s.length());
		System.out.println(s.charAt(0));
		System.out.println(s.substring(0,1));
		System.out.println(s.compareTo(s1));
		
		//Whenever there is any change made to string then a new object in created and previous is given to garbage collection in heap
		//In SCP it stays and removed by JVM.
	}

}
