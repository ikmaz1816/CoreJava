package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hashmap {

	public static void main(String[] args) {
		HashMap<String,Integer> map=new HashMap<>(); 
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			String name=sc.next();
			if(map.containsKey(name))
			{
				map.put(name, map.get(name)+1);
			}
			else
			{
				map.put(name,1);
			}
		}
		for(Map.Entry<String,Integer> e:map.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
		map.remove("Imran",1);
		sc.close();
	}

}
