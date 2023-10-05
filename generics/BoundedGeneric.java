package generics;

public class BoundedGeneric {
	private static Employee[] employee=new Employee[5];
	static int index=0;
	public static<T extends Print> void displayAllEmployees()
	{
		for(int i=0;i<employee.length;i++)
		{
			if(employee[i]==null)
				return;
			employee[i].print();
		}
	}
	public static void addEmployee(Employee e)
	{
		if(index>=5)
			return;
		employee[index++]=e;
	}
}
