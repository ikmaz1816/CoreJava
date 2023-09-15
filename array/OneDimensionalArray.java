package array;

import java.util.Scanner;

public class OneDimensionalArray {
	public static void main(String[] args) {
		/*
		  Arrays are stored memory which stores all data in contagious memory allocation
		  A single dimensional array used everything in a row and the size is fixed
		  We also have to define the type of array
		 */
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] arr=new String[n];
		
		//Taking user input through indexing
		int length=arr.length;
		for(int i=0;i<length;i++)
		{
			arr[i]=sc.next();
		}
		
		for(String s:arr)
		{
			System.out.println(s);
		}
		
		//We can also change of a particular index
		if(length>2)
			arr[2]="Immi";
		for(int i=0;i<length;i++)
		{
			System.out.println(arr[i]);
		}
		sc.close();
		
	}
}
