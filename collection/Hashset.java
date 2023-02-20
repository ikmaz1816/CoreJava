package collection;

import java.util.*;

public class Hashset {

	public static void main(String[] args) {
		//It allows no duplicate entries
		HashSet<Employee> hs=new HashSet<>();
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
