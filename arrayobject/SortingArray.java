package arrayobject;

import java.util.Arrays;
import java.util.Comparator;

public class SortingArray {
	Student[] students;
	int index=0;
	public SortingArray()
	{
		students=new Student[2];
	}
	public void addStudent(Student s)
	{
		students[index++]=s;
	}
	public void sort()
	{
		Arrays.sort(students,new Comparator<Student>()
				{

					@Override
					public int compare(Student s1,Student s2)
					{
						return s1.getName().compareTo(s2.getName());
					}
				});
	}
	public void print()
	{
		for(Student s:students)
		{
			System.out.println(s.getId()+" "+s.getName());
		}
	}
}
