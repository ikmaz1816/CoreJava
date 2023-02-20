package collection;

//import java.util.Objects;

public class Employee implements Details{

	int id;
	String name;
	public Employee(int id,String name)
	{
		this.name=name;
		this.id=id;
	}
	//Use for Treeset in Djikstra
//	public boolean equals(Employee o)
//	{
//		if(this==o)
//			return true;
//		if(o==null || o.getClass()!=this.getClass())
//			return false;
//		Employee e=(Employee)o;
//		return id==e.id && name.equals(e.name);
//	}
//	public int hashCode(Object o)
//	{
//		return Objects.hash(id,name);
//	}
	public void displayDetails()
	{
		System.out.println(this.name+" "+this.id);
	}
}
