package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) {
		List<Integer> ls=new ArrayList<>();
		ls=Arrays.asList(1,2,3,4,5);
		
		Stream<Integer> s1=ls.stream().filter(n->n%2==0);
		Stream<Integer> s2=s1.map(n-> n*2);
		int res=s2.reduce(0, (c,e)->c+e);
		System.out.println(res);
		
		//Shortcut way
		int result = ls.stream().filter(n->n%2==0).map(n->n*2).reduce(0,(c,e)->c+e);
		System.out.println(result);
		
		List<Integer> ans=ls.stream().filter(n->n%2==0).map(n->n*2).toList();
		System.out.println(ans);
	}

}
