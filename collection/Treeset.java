package collection;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		TreeSet<Employee> hs=new TreeSet<>(new Comparator<>()
				{
					public int compare(Employee x,Employee y)
					{
						return x.id-y.id;
					}
				});
		//in the employees class you have to mention the equals method and then the hashcode as well.
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int id=sc.nextInt();
			String name=sc.next();
			hs.add(new Employee(id,name));
		}
		while(hs.size()!=0)
		{
			Employee e=hs.iterator().next();
			int id=e.id;
			String name=e.name;
			hs.remove(e);
			System.out.println(id+" "+name);
		}
		sc.close();

	}

}
