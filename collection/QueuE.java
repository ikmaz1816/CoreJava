package collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueuE {

	public static void main(String[] args) {
		Queue<Employee> q=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int id=sc.nextInt();
			String name=sc.next();
			q.offer(new Employee(id,name));
		}
		while(!q.isEmpty())
		{
			int id=q.peek().id;
			String name=q.peek().name;
			q.poll();
			System.out.println(id+" "+name);
		}
		sc.close();
	}

}
