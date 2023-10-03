package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Integer> ls=Arrays.asList(1,2,3,4,5);
		
		List<Integer> filter=ls.stream().filter(x->x%2==0).toList();
		System.out.println(filter);
		
		List<Integer> map=filter.stream().map(n->n*2).collect(Collectors.toList());
		System.out.println(map);
		
		int sum=map.stream().reduce(0,(c,e)->c+e);
		System.out.println(sum);
		
		//ls.removeIf(x->x==2);
		
		ls.forEach(x->System.out.println(x));
		
		ls.forEach(System.out::println);
		
		//If there is an object and objectmethod
		//ls->Student Student has print method 
		//ls.forEach(Student::print)
	}
}
