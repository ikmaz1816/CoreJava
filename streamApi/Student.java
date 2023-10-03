package streamApi;

import java.util.Arrays;
import java.util.List;

public class Student {
	private int id;
	private String name;
	public Student() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public void print()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		List<Student> list=Arrays.asList(new Student(1,"Imran"),new Student(2,"Ayaan"));
		
		list.forEach(Student::print);
		
	}
	
}
