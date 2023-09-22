package strings;

public class StringBufferClass {
	public static void main(String[] args) {
		/*
		  StringBuffer is the same as StringBuilder and String but it is not thread safe and it is
		  mutable
		  It has the same methods as String Builder
		 */
		StringBuffer sb=new StringBuffer("Imran");
		System.out.println(sb.length());
		/*
		  It is mutable and hence on change would not create any new Object in the heap area
		 */
	}
}
