package collectionsorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) {
//		PriorityQueue<Student> pq=new PriorityQueue<>(new MyComparator());
		PriorityQueue<Student> pq=new PriorityQueue<>();
		pq.offer(new Student(1,"Imran"));
		pq.offer(new Student(2,"Ayaan"));
		
		while(!pq.isEmpty())
		{
			Student s=pq.poll();
			System.out.println(s.getId()+" "+s.getName());
		}
		
		//We can also use Collections.sort -> Comparable
		List<Student> list=Arrays.asList(new Student(1,"Imran"),new Student(2,"Ayaan"));
		Collections.sort(list,(x1,x2)->x2.getId()-x1.getId());
		for(Student s:list)
		{
			System.out.println(s.getId()+" "+s.getName());
		}
	}
}
