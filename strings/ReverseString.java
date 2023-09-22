package strings;

public class ReverseString {
	public static void main(String[] args) {
		String s=new String("Imran");
		
		String rev="";
		
		/*
		 	First approach we can iterate on the string from last
		 	
		 	Second approach adding the string reversely
		 */
		
		//Second approach
		
		for(int i=0;i<s.length();i++)
		{
			rev=s.charAt(i)+rev;
		}
		
		System.out.println(rev);
	}
}
