package strings;

public class StringBuilderClass {
	/*
	  StringBuilder are same as Strings as they are also thread safe 
	  StringBuilder are mutable and dont create any copy in SCP but only mutable copies in heap
	 */
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Imran");
		
		System.out.println(sb.length());
		System.out.println(sb.equals("Im"));
		System.out.println(sb.substring(0));
		System.out.println(sb.reverse());
		System.out.println(sb.append("Khan"));
		System.out.println(sb.deleteCharAt(5));
		System.out.println(sb.delete(0,3));
		System.out.println(sb.compareTo(new StringBuilder("Imran")));
		
		String s=sb.toString();
		System.out.println(s);
	}
}
