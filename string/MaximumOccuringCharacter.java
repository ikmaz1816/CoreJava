package string;

import java.util.Map;
import java.util.TreeMap;

public class MaximumOccuringCharacter {

	public static void main(String[] args) {
		String s=new String("aaaazzzzyyyuuuu");
		TreeMap<Character,Integer> map=new TreeMap<>();
		for(int i=0;i<s.length();i++)
		{
			if(map.containsKey(s.charAt(i)))
			{
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}
			else {
				map.put(s.charAt(i), 1);
			}
		}
		int maxCount=0;
		char character=' ';
		for(Map.Entry<Character, Integer> e:map.entrySet())
		{
			if(maxCount<=map.get(e.getKey()))
			{
				character=e.getKey();
				maxCount=e.getValue();
			}
		}
		System.out.println(character);
	}

}
