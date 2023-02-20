package collection;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class MyComparator implements Comparator<Employee>
{
	public int compare(Employee x,Employee y)
	{
		//for ascending
		//return x.id-y.id;
		return y.id-x.id;
	}
}

//This is to be written in the class itself.The class should implement the comparable interface and should have the compare to method.
//class MyComparable implements Comparable<Employee>
//{
//	public int compareTo(Employee x)
//	{
//		return this.id-x.id;
//	}
//}
public class PriorityQ {

	public static void main(String[] args) {
		PriorityQueue<Employee> q=new PriorityQueue<>(new MyComparator());
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int id=sc.nextInt();
			String name=sc.next();
			q.add(new Employee(id,name));
		}
		while(!q.isEmpty())
		{
			int id=q.peek().id;
			String name=q.peek().name;
			q.remove();
			System.out.println(id+" "+name);
		}
		sc.close();
	}

}
