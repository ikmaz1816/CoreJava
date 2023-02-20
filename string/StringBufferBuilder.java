package string;

public class StringBufferBuilder {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Ayaan");
		sb.append("Imran");
		//StringBuffer object are created in heap only
		//It is thread safe
		//StringBuffer is mutable
		
		StringBuilder sbu=new StringBuilder("Imran");
		sbu.append("Alfred");
		//StringBuilder object is created in heap only
		//It is not thread safe
		//StringBuilder is mutable
		//It is more faster than string and stringBuffer
		
		System.out.println(sb.charAt(0));
		
		System.out.println(sb.delete(0, 1));
		
		System.out.println(sb.deleteCharAt(0));
		
		sb.append("im");
		
		sb.substring(0);
		
		sb.substring(0, 3);
	}

}
