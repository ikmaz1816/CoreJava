package string;

public class CountSpaces {

	public static void main(String[] args) {
		String s="Imran is my name";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
				count++;
		}
		System.out.println(count);
	}

}
