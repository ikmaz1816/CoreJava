package collection;

import java.util.Scanner;

public class BoundedGeneric {
	
	public static void main(String[] args) {
		Employee[] arr=new Employee[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			arr[i]=new Employee(sc.nextInt(),sc.next());
		}
		display(arr);
		sc.close();
	}

	//T is an interface and it will extend another interface
	private static<T extends Details> void display(Employee[] arr) {
		//Running a loop to print all the details with the print method of the Employee class which also implements the Details interface
		for(int i=0;i<arr.length;i++)
		{
			arr[i].displayDetails();
		}
		
	}

}
