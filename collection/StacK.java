package collection;

import java.util.Scanner;
import java.util.Stack;

public class StacK {

	public static void main(String[] args) {
		Stack<Employee> s=new Stack<>();
		// LIFO ->Last In First Out
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int id=sc.nextInt();
			String name=sc.next();
			s.push(new Employee(id,name));
		}
		while(!s.isEmpty())
		{
			int id=s.peek().id;
			String name=s.peek().name;
			s.pop();
			System.out.println(id+" "+name);
		}
		sc.close();
	}
}
