package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollection {
	public static void main(String[] args) {
		/*
		 	Set is used when we dont want to store duplicate values
		 	Can be implementated by
		 	HashSet
		 	TreeSet
		 */
		Set<Integer> set=new HashSet<>();
		/*
		 	It has a random order
		 */
		set.add(5);
		set.add(2);
		set.add(3);
		set.add(4);
		
		System.out.println(set);
		
		//removes from index
		set.remove(3);
		
		System.out.println(set);
		
		System.out.println(set.contains(2));
		
		set=new TreeSet<>();
		// Stores in a sorted Order
		set.add(5);
		set.add(2);
		set.add(3);
		set.add(4);
		
		System.out.println(set);
		
		//removes from index
		set.remove(3);
		
		System.out.println(set);
		
		System.out.println(set.contains(2));
	}
}
