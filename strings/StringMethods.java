package strings;

import java.util.Arrays;

public class StringMethods {
	public static void main(String[] args) {
		String name="Imran";
		
		System.out.println(name.length());
		
		System.out.println(name.substring(0));
		
		System.out.println(name.startsWith("Im"));
		
		System.out.println(name.toLowerCase());
		
		System.out.println(name.toUpperCase());
		
		System.out.println(name.equalsIgnoreCase("IMRAN"));
		
		System.out.println(name.charAt(2));
		
		System.out.println(name.subSequence(0,3));
		
		System.out.println(name.substring(2,3));
		
		String[] array=name.split(" ");
		
		char[] array1=name.toCharArray();
		
		System.out.println(array);
		System.out.println(Arrays.toString(array1));
	}
}
