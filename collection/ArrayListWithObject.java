package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListWithObject {

	public static void main(String[] args) {
		List<Employee> ls=new ArrayList<>();
		ls=Arrays.asList(new Employee(2,"Ayaan"),new Employee(1,"Imran"));
		for(int i=0;i<ls.size();i++)
		{
			System.out.println(ls.get(i).id + ls.get(i).name);
		}
		
		for(Employee e:ls)
		{
			System.out.println(e.id+" "+e.name);
		}
		Collections.sort(ls,(x,y)->x.id-y.id);
		
		for(Employee e:ls)
		{
			System.out.println(e.id+" "+e.name);
		}
	}

}
