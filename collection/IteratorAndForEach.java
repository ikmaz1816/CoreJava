package collection;


import java.util.*;



public class IteratorAndForEach {

	public static void main(String[] args) {
		List<Integer> arr=new ArrayList<>();
		arr=Arrays.asList(1,2,3,4,5);
		
		Iterator<Integer> it=arr.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		arr.forEach(n->System.out.println(n));
	}

}
