package generics;

public class Main {
	public static void main(String[] args) {
		ClassWithOneGeneric<Integer> generic1=new ClassWithOneGeneric<Integer>();
		generic1.setId(2);
		System.out.println(generic1.getId());
		
		ClassWithTwoGeneric<Integer,String> generic2=new ClassWithTwoGeneric<>();
		generic2.setFirst(10);
		generic2.setSecond("Imran");
		System.out.println(generic2.getFirst());
		System.out.println(generic2.getSecond());
		
		//Having a generic inside another generic
		ClassWithTwoGeneric<ClassWithTwoGeneric<Integer,String>,String> generic3=new ClassWithTwoGeneric<>();
		ClassWithTwoGeneric<Integer,String> generic=new ClassWithTwoGeneric<>();
		generic.setFirst(20);
		generic.setSecond("Imran");
		generic3.setFirst(generic);
		generic3.setSecond("Khan");
		
		System.out.println(generic3.getFirst().getFirst() +" "+generic3.getFirst().getSecond());
		System.out.println(generic3.getSecond());
		
		/*
		 	Bounded generic is a technique of binding a method to an interface which is implementated
		 	in the base class
		 	Employee class has method print which is necessary as the method extends the 
		 	Print interface and hence the base class should have the implementation
		 */
		BoundedGeneric.addEmployee(new Employee(1,"Imran"));
		BoundedGeneric.addEmployee(new Employee(2,"Ayaan"));
		BoundedGeneric.addEmployee(new Employee(3,"Alfred"));
		BoundedGeneric.displayAllEmployees();
	}
}
