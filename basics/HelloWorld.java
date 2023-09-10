package basics;

public class HelloWorld {
	/*
	    Let us understand how Java works
	    
	    Java is a platform independant language which means it can we used on any system
	    We only need the JDK
	    JDK->Java development Kit
	    JDK contains the JRE
	    JRE->Java Runtime Environment
	    It actually provides the framework to run the Java classes and other dependencies 
	    JRE contains the JVM and other libraries
	    JVM->Java Virtual Machine which is used to compile the class file
	    Java is compiled to byteCode and converted to .class file which is executable
	    Other libraries ->These are other functions that are used by the Java classes and are other
	    stored in the JRE
	    So JRE performs the integration of JVM and other libraries 
	    The JVM searches for the main method the class will compile even if there is no main method
	    but will not execute
	    To make a class executable it should have a main method
	    
	 */
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}
