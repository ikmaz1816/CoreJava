package string;

public class ReverseAString {

	public static void main(String[] args) {
		String s="This is Imran Khan";
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		System.out.println(sb);
		
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			s1=s.charAt(i)+s1;
		}
		System.out.println(s1);
	}

}
