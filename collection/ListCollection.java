package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCollection {
	public static void main(String[] args) {
		
		/*
		 	List->Is an interface 
		 	Implementated by ArrayList , LinkedList etc
		 */
		
		List<Integer> list=new ArrayList<Integer>();
		// List is just the dynamic array
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		System.out.println(list);
		
		//removes from index
		list.remove(3);
		
		System.out.println(list);
		
		System.out.println(list.get(0));
		
		list=new LinkedList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		System.out.println(list);
		
		//removes from index
		list.remove(3);
		
		System.out.println(list);
		
		System.out.println(list.get(0));
		/*
		 	If we use only LinkedList class then we can use addFirst addLast add=addFirst
		 	All other functionality
		 */
	}
}
