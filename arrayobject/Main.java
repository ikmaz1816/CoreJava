package arrayobject;

public class Main {
	public static void main(String[] args) {
		SortingArray array=new SortingArray();
		Student s=new Student(1,"Imran");
		Student s1=new Student(2,"Ayaan");
		
		array.addStudent(s);
		array.addStudent(s1);
		array.sort();
		array.print();
	}
}
