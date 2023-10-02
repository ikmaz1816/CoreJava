package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapCollection {
	/*
	 	It is a key value pair
	 	It is an interface implementated by 
	 	HashMap
	 	Treemap
	 */
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<>();
		map.put("Imran", 1);
		map.put("Ayaan", 2);
		
		//for iterating on keys
		for(String s:map.keySet())
		{
			System.out.println(s);
		}
		
		//for iterating on values
		for(int i:map.values())
		{
			System.out.println(i);
		}
		
		//printing everything
		for(Map.Entry<String,Integer> entry:map.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		for(int i=0;i<2;i++)
		{
			String s="Imran";
			map.put(s, map.getOrDefault(s, 0)+1);
			//It will check whether it is present if present then get it value and increment
		}
		
		//printing everything
		for(Map.Entry<String,Integer> entry:map.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
			
		//In the same way we can use tree map for sorting
		map=new TreeMap<>();
		map.put("Zaid", 0);
		map.put("Imran", 1);
		map.put("Ayaan", 2);
		//Sort on the basis of keys  or we can add our own comparator
		for(Map.Entry<String,Integer> entry:map.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
