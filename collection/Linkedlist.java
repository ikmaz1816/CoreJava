package collection;

import java.util.LinkedList;
import java.util.Scanner;

public class Linkedlist {

	public static void main(String[] args) {
		LinkedList<Employee> ll=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int id=sc.nextInt();
			String name=sc.next();
			ll.add(new Employee(id,name));
		}
		for(int i=0;i<ll.size();i++)
		{
			System.out.println(ll.get(i).id+" "+ll.get(i).name);
		}
		sc.close();
	}

}
